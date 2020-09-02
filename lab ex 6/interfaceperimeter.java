/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex6;
import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class interfaceperimeter {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double radi=obj.nextDouble();
        System.out.println("Enter length and breadth of rectangle  : ");
        double leng=obj.nextDouble();
        double bdth=obj.nextDouble();
        circle obj1=new circle(radi);
        rectangle obj2=new rectangle(leng,bdth);
        obj1.pericalc();
        obj2.pericalc();
    }
}
interface perimeter
{
    void pericalc();
}
class circle implements perimeter
{
    double r;
    circle(double r1)
    {
        r=r1;
    }
    public void pericalc()
    {
        double peri1;
        peri1=3.14*r*r;
        System.out.println("Perimeter of circle = "+peri1);
    }
}
class rectangle implements perimeter
{
    double l,b;
    rectangle(double l1,double b1)
    {
        l=l1;
        b=b1;
    }
    public void pericalc()
    {
        double peri2;
        peri2=l*b;
        System.out.println("Perimeter of rectangle = "+peri2);
    }
}