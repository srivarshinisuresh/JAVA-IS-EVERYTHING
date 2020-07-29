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
public class powerofnum {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the base");
        int a =obj.nextInt();
        System.out.println("enter the exponential");
        int b= obj.nextInt();
        int result=1;
        while(b!=0){
            result=result*a;
            --b;
        }
        System.out.println("the power is "+result);
        }
        
    }
    

