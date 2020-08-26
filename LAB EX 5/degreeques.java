/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex5;

/**
 *
 */
public class degreeques {
    public static void main(String[] args){
        degree obj1=new degree();
        System.out.println("Calling degree class method :");
        obj1.getdegree();
        undergraduate obj2=new undergraduate();
        System.out.println("Calling undergraduate class method :");
        obj2.getdegree();
        postgraduate obj3=new postgraduate();
        System.out.println("Calling postgraduate class method :");
        obj3.getdegree();
    }
}
class degree
{
    public void getdegree()
    {
        System.out.println("I got a degree");
    }
}
class undergraduate extends degree
{
    public void getdegree()
    {
        System.out.println("I am a undergraduate");
    }
}
class postgraduate extends degree
{
    public void getdegree()
    {
        System.out.println("I am a postgraduate");
    }
}