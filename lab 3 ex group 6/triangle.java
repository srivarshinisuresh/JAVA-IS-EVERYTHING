/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex3;
import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class triangle {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        double side1,side2,side3;
        int ans;
        System.out.println("enter 3 sides of triangle");
        side1=obj.nextDouble();
        side2=obj.nextDouble();
        side3=obj.nextDouble();
        ans=tri.aretriangular(side1,side2,side3);
        if(ans==1)
            System.out.println("Triangle can be formed");
        else
            System.out.println("Triangle cannot be formed");
    }
}
class tri
{
    static double s1,s2,s3;
    static int aretriangular(double sid1,double sid2,double sid3)
    {
        s1=sid1;
        s2=sid2;
        s3=sid3;
        if((s1+s2)>s3 && (s2+s3)>s1 && (s1+s3)>s2)
        {
           return 1;
        }
        else
        {
            return 0;
        }
    } 
    
}
