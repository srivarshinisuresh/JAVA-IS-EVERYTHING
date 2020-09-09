/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class listintersection {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        Scanner obj=new Scanner(System.in);
        System.out.println("Size of list 1 : ");
        int m=obj.nextInt();
        System.out.println("Size of list 2 : ");
        int n=obj.nextInt();
        System.out.println("Enter the members of the list 1 : ");
        for(int i=0;i<m;i++)
        {
            int e=obj.nextInt();
            list1.add(e);
        }
        System.out.println("Enter members of the list 2 : ");
        for(int i=0;i<n;i++)
        {
            int e=obj.nextInt();
            list2.add(e);
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println("Sorted List 1 : "+list1);
        System.out.println("Sorted List 2 : "+list2);
        intersection ob=new intersection();
        list3=ob.intersect(list1,list2,m,n);
        System.out.println("The common elements of the list are : "+list3);
    }
}
class intersection
{
    ArrayList<Integer> lt1=new ArrayList<>();
    ArrayList<Integer> lt2=new ArrayList<>();
    ArrayList<Integer> lt3=new ArrayList<>();
    int x,y;
    ArrayList intersect(ArrayList l1,ArrayList l2,int a,int b)
    {
       lt1=l1;
       lt2=l2;
       x=a;
       y=b;
       for(int i=0;i<x;i++)
       {
           for(int j=0;j<y;j++)
           {
              if(lt1.get(i) == lt2.get(j))
                {
                    lt3.add(lt1.get(i));
                }
           }
       }
       return lt3;
    }
    
}
