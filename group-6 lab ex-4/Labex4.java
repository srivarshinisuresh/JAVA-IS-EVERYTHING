/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex4;
import book.*;
import journal.*;
import java.util.Scanner;

/**
 *
 * @author POOJHA KEERTHI
 */
public class Labex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sbid,sjid,stbid,stjid;
        Scanner obj=new Scanner(System.in);
        System.out.println("REQUESTED BY STAFF :");
        System.out.println("Enter book id");
        sbid=obj.nextInt();
        System.out.println("Enter journal id");
        sjid=obj.nextInt();
        System.out.println("REQUESTED BY STAFF :");
        System.out.println("Enter book id");
        stbid=obj.nextInt();
        System.out.println("Enter journal id");
        stjid=obj.nextInt();
        student ob1=new student(sbid,sjid);
        staff ob2=new staff(stbid,stjid);
        System.out.println("DETAILS OF BOOKS AND JOURNALS REQUESTED BY STUDENT");
        ob1.getstudentdetails();
        System.out.println("DETAILS OF BOOKS AND JOURNALS REQUESTED BY STAFF");
        ob2.getstaffdetails();
    }
    
}
class student
{
    int bid,jid;
    book.bookdetails ob1=new book.bookdetails();
    journal.journaldetails ob2=new journal.journaldetails();
    student(int b,int j)
    {
        bid=b;
        jid=j;
    }
    void getstudentdetails()
    {
        int f1=0;
        int f2=0;
        for(int i=0;i<5;i++)
        {
            if(ob1.bookid[i]==bid)
            {
                f1=1;
                System.out.println("BOOK DETAILS :");
                ob1.display(i);
            } 
        }
        if(f1==0)
        {
            System.out.println("Invalid book id");
        }
        for(int i=0;i<5;i++)
        {
            
            if(ob2.journalid[i]==jid)
            {
                f2=1;
                System.out.println("JOURNAL DETAILS :");
                ob2.display(i);
            } 
        }
        if(f2==0)
        {
            System.out.println("Invalid journal id");
        }
    }
}
class staff
{
    int tbid,tjid;
    book.bookdetails ob3=new book.bookdetails();
    journal.journaldetails ob4=new journal.journaldetails();
    staff(int b,int j)
    {
        tbid=b;
        tjid=j;
    }
    void getstaffdetails()
    {
        int f1=0;
        int f2=0;
        for(int i=0;i<5;i++)
        {
            if(ob3.bookid[i]==tbid)
            {
                f1=1;
                System.out.println("BOOK DETAILS :");
                ob3.display(i);
            } 
        }
        if(f1==0)
        {
            System.out.println("Invalid book id");
        }
        for(int i=0;i<5;i++)
        {
            
            if(ob4.journalid[i]==tjid)
            {
                f2=1;
                System.out.println("JOURNAL DETAILS :");
                ob4.display(i);
            } 
        }
        if(f2==0)
        {
            System.out.println("Invalid journal id");
        }
    }
}