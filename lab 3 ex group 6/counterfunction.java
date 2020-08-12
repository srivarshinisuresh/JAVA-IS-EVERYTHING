/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex3;

/**
 *
 * @author POOJHA KEERTHI
 */
public class counterfunction {
    public static void main(String[] args){
        counter obj=new counter();
        counter obj2=new counter();
        System.out.println("Values after incrementing once");
        obj.incre();
        System.out.println("Values after incrementing second time");
        obj2.incre();
    }
}
class counter
{
    static int i=20;
    int j=20;
    void incre()
    {
        i=i+5;
        j=j+5;
        System.out.println("i = "+i);
        System.out.println("j = "+j);
    }
}