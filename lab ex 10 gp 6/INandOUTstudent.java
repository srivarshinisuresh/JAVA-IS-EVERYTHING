  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author SRI
 */
public class INandOUTstudent {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout=new FileOutputStream("C:\\Users\\SRI\\Documents\\NetBeansProjects\\labex10\\src\\labex10\\IN");
        student ob[]=new student[100];
        System.out.println("enter student names : ");
        for(int i=0;i<100;i++)
        {
            ob[i]=new student();
            String s=ob[i].getdata();
            byte b[]=s.getBytes();
            fout.write(b);
            fout.write(32);
        }
        fout.close();
        File f1=new File("C:\\Users\\POOJHA KEERTHI\\Documents\\NetBeansProjects\\labex10\\src\\labex10\\IN");
        FileInputStream fin=new FileInputStream(f1);
        File f2=new File("C:\\Users\\POOJHA KEERTHI\\Documents\\NetBeansProjects\\labex10\\src\\labex10\\OUT");
        FileOutputStream fout1=new FileOutputStream(f2);
        int i;
        while((i=fin.read())!= -1)
        {
          if(i>=65 && i<=90 ){
                i=i+32;
            }
            
           fout1.write((char)i);
        }
        fin.close();
        fout1.close();
        
        }
        
        
    }

class student
{
    Scanner obj=new Scanner(System.in);
    String getdata()
    {
        String n=obj.next();
        return n;
    }
    
}