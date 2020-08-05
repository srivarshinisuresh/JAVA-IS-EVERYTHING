/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.ex.pkg1;

/**
 *
 * @author POOJHA KEERTHI
 */
public class sumofnosdivisibleby7 {
    public static void main(String[] args){
        int n,sum=0,i;
        System.out.println("the integers between 100 and 200 that are divisible by 7 are");
        for(i=101;i<200;i++)
        {
            if(i%7 == 0)
            {
                sum=sum+i;
                System.out.println(i);
            }
        }
        System.out.println("Sum = "+sum);
    }
}
