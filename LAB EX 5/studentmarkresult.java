/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

import java.util.Scanner;

/**
 *
 */
public class studentmarkresult {
    public static void main(String[] args){
        result ob=new result();
        ob.calculate();
        ob.display();
    }
}
class stud
{
    String name;
    String rollno;
    Scanner obj=new Scanner(System.in);
    public void read()
    {
        System.out.println("Enetr student name : ");
        name=obj.next();
        System.out.println("Enter student roll number : ");
        rollno=obj.next();
    }
    public void display()
    {
        System.out.println("Student details : ");
        System.out.println("Name : "+name+"\nRoll no : "+rollno);
    }
}
class mark extends stud
{
    double m1,m2,m3;
    public void read()
    {
        super.read();
        System.out.println("Enter mark 1 : ");
        m1=obj.nextDouble();
        System.out.println("Enter mark 2 : ");
        m2=obj.nextDouble();
        System.out.println("Enter mark 3 : ");
        m3=obj.nextDouble();
    }
    public void display()
    {
        super.display();
        System.out.println("Student mark details : ");
        System.out.println("Mark 1 : "+m1+"\nMark 2 : "+m2+"\nMark 3 : "+m3);
    }
}
class result extends mark
{
    double total,avg;
    public void calculate()
    {
        super.read();
        total=m1+m2+m3;
        avg=total/3;
    }
    public void display()
    {
        super.display();
        System.out.println("Student Result");
        System.out.println("Total : "+total+"\nAverage : "+avg);
    }
}
