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
public class largestof3num {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=obj.nextInt();
        System.out.println("Enter the second number");
        int b=obj.nextInt();
        System.out.println("enter the third number");
        int c=obj.nextInt();
        if(a>b && a>c){
            System.out.println("largest number "+a);
                    }
        else if(b>c && b>a){
            System.out.println("largest number "+b);
        }
        else{
            System.out.println("largest number "+c);
        }
        
        }
        
        
    }
    

