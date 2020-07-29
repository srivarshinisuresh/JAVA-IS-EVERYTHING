/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class simplecalculator {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=obj.nextInt();
        System.out.println("enter the second number");
        int b=obj.nextInt();
        System.out.println("enter the number from 1 to 4");
        int c=obj.nextInt();
        
        switch(c)
        {
            case 1:
                System.out.println("addition "+(a+b));
                break;
            case 2:
                System.out.println("subtraction "+(a-b));
                break;
            case 3:
                System.out.println("multiplication "+(a*b));
                break;
            case 4:
                System.out.println("division "+(a/b));
                break;
            default:
                System.out.println("sorry!enter the correct choice");
                break;
        }
        
    }
    
}
