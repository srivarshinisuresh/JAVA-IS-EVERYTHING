/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

import java.util.Scanner;



class arith
{
    int a;
    int b;
    int c;
    int add(int a ,int b){
        c=a+b;
        return (c);
    }
    int sub(int a,int b){
        c=a-b;
        return(c);
    }
    int mul(int a,int b){
        c=a*b;
        return(c);
    }
    int div(int a,int b){
        c=a/b;
        return(c);
    }
    
}

/**
 *
 * @author NEW
 */
public class arithmetic {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        arith d=new arith();
        System.out.println("enter the first number");
        int a=obj.nextInt();
        System.out.println("enter the second number");
        int b=obj.nextInt();
        System.out.println( "addition "+d.add(a,b));
        System.out.println( "subtraction "+d.sub(a,b));
        System.out.println("multiplication "+d.mul(a,b));
        System.out.println("division "+d.div(a,b));
        
        
        
        
        
    }
    
}
