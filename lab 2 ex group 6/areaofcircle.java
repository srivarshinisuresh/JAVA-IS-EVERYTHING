/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex2;

import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class areaofcircle {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        circle obj1=new circle();
        System.out.print("enter radius : ");
        double rad=obj.nextDouble();
        circle obj2=new circle(rad);
        System.out.println("the entered radius is "+(obj2.getradius()));
        obj2.area();
        System.out.println("Area of circle = "+(obj2.getarea()));
    } 
}
class circle
{
    private double radius=1.0;
    private String color="red";
    double area;
    circle()
    {
        System.out.println("DEFAULT CONSTRUCTOR");
    }
    circle(double r)
    {
       radius=r; 
    }
    double getradius()
    {
       return radius; 
    }
    void area()
    {
        area=3.14*radius*radius;
    }
    double getarea()
    {
        return area;
    }
}