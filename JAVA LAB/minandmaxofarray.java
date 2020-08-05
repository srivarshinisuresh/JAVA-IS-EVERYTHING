/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg1;
import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class minandmaxofarray {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int i,j,t=0,n,max=0,min=0;
        int a[]=new int[20];
        System.out.println("enter size of array");
        n=obj.nextInt();
        System.out.println("enter the elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("the elements of the array are :");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
               if(a[i]>a[j])
               {
                  t=a[i];
                  a[i]=a[j];
                  a[j]=t;
               }
            }
        }
        min=a[0];
        max=a[n-1];
        System.out.println("Largest in the array = "+max);
        System.out.println("Smallest in the array = "+min);
    }
}
