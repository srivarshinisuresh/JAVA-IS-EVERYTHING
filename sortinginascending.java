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
public class sortinginascending {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter length");
        int n=obj.nextInt();
        int temp;
        int a[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                {
                    if(a[i]>a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        
            System.out.println("after sorting");
            for( int i=0;i<n;i++){
                System.out.println(a[i]);
            }
        
    }
}


    


                        
                    
                
                
            
        
    
    

