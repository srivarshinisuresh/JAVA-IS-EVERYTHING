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
public class msgdisplayedformark {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the mark of the student");
        int n=obj.nextInt();
        switch(n)
        {
            case 0:
            case 1:
            case 2:
            {
                System.out.println("Very poor");
                break;
            }
            case 3:
            case 4:
            case 5:
            {
                System.out.println("Poor");
                break;
            }
            case 6:
            case 7:
            {
                System.out.println("Good");
                break;
            }
            case 8:
            case 9:
            {
                System.out.println("Very good");
                break;
            }
            case 10:
            {
                System.out.println("Excellent");
                break;
            }
            default:
                System.out.println("The given mark is not valid");
        }
    }
    
}
