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
public class breakinttodigits {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the integer");
        int a=obj.nextInt();
        int b=a;
        int count=0;
        int digit=0;
        while(a>0){
            a=a/10;
            count=count+1;
        }
        while(b>0){
            digit=b%10;
            System.out.println("digit at place "+count+" is "+digit);
            b=b/10;
            count--;
        }
        
        }
    
    
}
