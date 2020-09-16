/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex8;

import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class freqofwords {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter string : ");
        s=obj.nextLine();
        System.out.println("Entered string : "+s);
        int count=0;
        String s1[]=s.split(" ");
        System.out.println("Duplicate words");
        for(int i=0;i<s1.length;i++)
        {
            count=1;
            for(int j=i+1;j<s1.length;j++)
            {
                if(s1[i].equals(s1[j]))
                {    
                    count++;  
                    s1[j] = "0";   
                } 
            }
            if(count>1 && s1[i]!="0")
            {
                System.out.println(s1[i]+"...."+count+" times");
            }
        }
    }
}
