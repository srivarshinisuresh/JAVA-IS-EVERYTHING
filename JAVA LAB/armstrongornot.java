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
public class armstrongornot {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number");
        int n=obj.nextInt();
        int i,a,s=0,r=0;
        a=n;
        while(n!=0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(s==a)
        {
            System.out.println("The given number is an armstrong number");
        }
        else
        {
            System.out.println("The given number is not an armstrong number");
        }
    }
}
