/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex11;

import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class libraryprogram {
    public static void main(String[] args){
        
        book ob=new book();
        user1 u1=new user1(ob);
        user2 u2=new user2(ob);
        user3 u3=new user3(ob);
        user4 u4=new user4(ob);
        user5 u5=new user5(ob);
        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
    }
}
class book
{
    int book1=1,book2=1,book3=1;
    synchronized public void lendingbook(int n)
    {
        if(n==1)
        {
            if(book1!=0)
            {
                System.out.println("Book lended");
                book1=0;
            }
            else
                System.out.println("Book unavailable");
        }
        else if(n==2)
        {
            if(book2!=0)
            {
                System.out.println("Book lended");
                book2=0;
            }
            else
                System.out.println("Book unavailable");
        }
        else if(n==3)
        {
            if(book3!=0)
            {
                System.out.println("Book lended");
                book3=0;
            }
            else
                System.out.println("Book unavailable");
        }
        else
        {
            System.out.println("invalid book entry");
        }
    }
    int getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1--> book1\t2-->book2\t3-->book3");
        int o=obj.nextInt();
        return o;
    }
}
class user1 extends Thread
{
    book b;
    int option;
    public user1(book b)
    {
        this.b=b;
        int o=b.getdata();
        this.option=o;
    }
    public void run()
    {
        b.lendingbook(option);
    }
}
class user2 extends Thread
{
    book b;
    int option;
    public user2(book b)
    {
        this.b=b;
        int o=b.getdata();
        this.option=o;
    }
    public void run()
    {
        b.lendingbook(option);
    }
}
class user3 extends Thread
{
    book b;
    int option;
    public user3(book b)
    {
        this.b=b;
        int o=b.getdata();
        this.option=o;
    }
    public void run()
    {
        b.lendingbook(option);
    }
}
class user4 extends Thread
{
    book b;
    int option;
    public user4(book b)
    {
        this.b=b;
        int o=b.getdata();
        this.option=o;
    }
    public void run()
    {
        b.lendingbook(option);
    }
}
class user5 extends Thread
{
    book b;
    int option;
    public user5(book b)
    {
        this.b=b;
        int o=b.getdata();
        this.option=o;
    }
    public void run()
    {
        b.lendingbook(option);
    }
}
