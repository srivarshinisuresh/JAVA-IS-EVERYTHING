/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;
import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class electricitybill {
    public static void main(String[] args)
    {
        bill ob[]=new bill[2];
        char t = 0;
        int i;
        for(i=0;i<2;i++)
        {
            ob[i]=new bill();
            ob[i].getdetails();
            ob[i].unitcalc();
            System.out.println("Type of EB connection\nd-domestic connection\nc-commercial connection\nEnter type : ");
            t=ob[i].gettype();    
        switch(t)
        {
            case 'd':
                ob[i].domamtcalc();
                break;
            case 'c':
                ob[i].comamtcalc();
                break;
            default:
                System.out.println("enter valid choice");
        }
        }
        for(i=0;i<2;i++)
        {
            System.out.println("CUSTOMER "+(i+1)+" DETAILS:");
            ob[i].display();
        }
        
    }
}
class bill
{
    Scanner obj=new Scanner(System.in);
    double prevunit,currentunit,unit;
    String cusnumber,cusname;
    double amt;
    void getdetails()
        {
        System.out.println("enter customer name");
        cusname=obj.next();    
        System.out.println("enter customer number");
        cusnumber=obj.next();    
        System.out.println("enter previous and current month readings");
        prevunit=obj.nextDouble();
        currentunit=obj.nextDouble(); 
        
        }
    char gettype()
        {
            char type=obj.next().charAt(0);
            return type;
        }
    void unitcalc()
        {
            unit=currentunit-prevunit;
        }
    void domamtcalc()
        {
           
           if(unit<=100)
               amt=unit*1.50;
           else if(101 <= unit && unit<= 200)
               amt= unit*3;
           else if(201 <=unit && unit<=500)
               amt= unit*4.50;
           else
               amt= unit*7;  
        }
    void comamtcalc()
        {
            
            if(unit<=100)
               amt= unit*2.50;
           else if(101 <= unit && unit<= 200)
               amt= unit*5;
           else if(201 <=unit && unit<=500)
               amt= unit*6.50;
           else
               amt= unit*9;
        }
    void display()
        {
            
            System.out.println("Customer number : "+cusnumber);
            System.out.println("Customer name : "+cusname);
            System.out.println("Previous month reading : "+prevunit);
            System.out.println("Current month reading = "+currentunit);
            System.out.println("Units consumed = "+unit);
            System.out.println("The bill amount is Rs."+amt);
        }
}