/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex8;

import java.util.Scanner;
/**
 *
 * @author POOJHA KEERTHI
 */
public class usernamepaasword {
    public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter username and password");
    String username=obj.next();
    String password=obj.next();
    System.out.println("username : "+username);
    System.out.println("password : "+password);
    if(username.length() == password.length())
    {
        if(username.equals(password))
        {
            System.out.println("The username and password are same");
            String concatenate=username+password;
            System.out.println("Concatenating username and password : "+concatenate);
        }
        else
            System.out.println("The username and password are not same");
    }
    else
        System.out.println("The username and password are not same");
  }   
}
