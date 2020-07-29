/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

import java.util.Scanner;

/**
 *
 * @author NEW
 */
public class productdiscount {
    public static void main(String main[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the original amount");
        double d=obj.nextDouble();
        System.out.println("enter the discount amount");
        double d1=obj.nextInt();
        double offer =d/100*d1;
        System.out.println("amount that should be paid "+(d-offer));
                
    }
    
}
