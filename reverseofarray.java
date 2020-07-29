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
public class reverseofarray {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the no.of elements to reverse");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements to be reversed");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]);
            
        }
        
        
    }
    
}
