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
public class formula {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter value");
        double y=obj.nextDouble();
        double answer=form.sigmoid(y);
        System.out.println("Answer = "+answer);
    }
}
class form
{
    static double x;
    static double ans;
    static double sigmoid(double z)
    {
        x=z;
        ans=1/(1-(Math.exp(-x)));
        return ans;
    }
}