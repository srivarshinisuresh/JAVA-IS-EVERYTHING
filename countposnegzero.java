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
public class countposnegzero {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n=obj.nextInt();
        int positivecount=0;
        int negativecount=0;
        int zero=0;
      
        int a[]= new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        int j=0;
        while(j<n)
        {
            if(a[j]>0){
                positivecount++;
            }
            else if(a[j]<0){
                negativecount++;
            }
            else if(a[j]==0){
                zero++;
            }
            j++;
            
            }
        System.out.println("number of positive numbers "+positivecount);
        System.out.println("the number of negative numbers "+negativecount++);
        System.out.println("the number of zero "+zero);
        }
        
    }
    

