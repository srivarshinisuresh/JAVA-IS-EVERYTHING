/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;

class student
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        name=obj.next();
        dept=obj.next();
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
    }
    void markcal()
    {
        avg=(m1+m2+m3)/3;
        if(m1<50 || m2<50 || m3<50)
        {
            status="fail";
        }
        else{
            if(avg>=80)
                status="1st class";
            else if(avg>=70 && avg<=79)
                status="2nd class";
            else if(avg>=50 && avg<=69)
                status="3rd class";
        }
    }
    void display()
    {
        System.out.println("name "+name+"\ndept:"+dept+"\nmark m1 "+m1+"\n m2 "+"\n m3:"+m3+"\n avg "+avg+"\nstatus "+status);
    }
    
}

/**
 *
 * @author NEW
 */
public class studentdetail {
    public static void main(String args[]){
        student obj[]=new student[10];
        for(int i=0;i<10;i++){
            obj[i]=new student();
            obj[i].getdata();
            obj[i].markcal();
            obj[i].display();
            
        }
        
    }
    
}
