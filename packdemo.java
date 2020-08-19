/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hi
 */
import pack1.demo1;
import pack1.subpack1.subdemo1;
import pack2.demo2;
import java.util.Scanner;
import pack2.subpack2.subdemo2;
 class packdemo {
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    demo1 obj1=new demo1();
    //System.out.println("Enter value of n to calculate the factorial:");
    //int n=obj.nextInt();
    obj1.fact(6);
    demo2 obj2=new demo2();
    System.out.println("Enter the values of a and b:");
    int a=obj.nextInt();
    int b=obj.nextInt();
    System.out.println("Addition of "+a+" and "+b+" is:"+obj2.add(a, b));
     System.out.println("Enter number to check odd or even:");
     int n=obj.nextInt();
    subdemo1 obj3=new subdemo1();
    obj3.oddeven(n);
    subdemo2 obj4=new subdemo2();
     System.out.println("Enter a number to check positive or negative or zero");
     int num=obj.nextInt();
     obj4.pnz(num);
    
    
    }    
}
