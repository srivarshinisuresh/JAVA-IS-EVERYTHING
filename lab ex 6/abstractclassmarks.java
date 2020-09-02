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
public class abstractclassmarks {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter 3 marks of student A : ");
        double mA1=obj.nextDouble();
        double mA2=obj.nextDouble();
        double mA3=obj.nextDouble();
        System.out.print("Enter 4 marks of student B : ");
        double mB1=obj.nextDouble();
        double mB2=obj.nextDouble();
        double mB3=obj.nextDouble();
        double mB4=obj.nextDouble();
        studentA ob1=new studentA(mA1,mA2,mA3);
        studentB ob2=new studentB(mB1,mB2,mB3,mB4);
        double perA=ob1.getpercentage();
        double perB=ob2.getpercentage();
        System.out.println("Percentage of Student A : "+perA);
        System.out.println("Percentage of Student B : "+perB);
    }
}
abstract class marks
{
    abstract double getpercentage();
}
class studentA extends marks
{
    double markA1,markA2,markA3;
    double totA=0,percentA=0;
    studentA(double m1,double m2,double m3)
    {
        markA1=m1;
        markA2=m2;
        markA3=m3;
    }
    double getpercentage()
    {
        totA =markA1+markA2+markA3;
        percentA=totA / 3;
        return percentA;
    }
}
class studentB extends marks
{
    double markB1,markB2,markB3,markB4;
    double totB=0,percentB=0;
    studentB(double m1,double m2,double m3,double m4)
    {
        markB1=m1;
        markB2=m2;
        markB3=m3;
        markB4=m4;
    }
    double getpercentage()
    {
        totB=markB1+markB2+markB3+markB4;
        percentB=totB / 4;
        return percentB;
    }
}