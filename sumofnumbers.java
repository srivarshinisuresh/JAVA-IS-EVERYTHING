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
public class sumofnumbers {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=obj.nextInt();
        int i,sum=0;
        System.out.println("enter the numbers");
        for(i=0;i<n;i++){
            sum=sum+obj.nextInt();
        }
        System.out.println("the sum of the given number "+sum);
    }
    
        }
        
    
    

