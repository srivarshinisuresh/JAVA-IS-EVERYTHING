/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

/**
 *
 * @author NEW
 */
public class customerinvoice {
    public static void main(String args[]){
        customer c1=new customer (101,"aaa",20);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(30);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        System.out.println("..........");
        
        customer c3=new customer(2,"ccc",40);
        System.out.println(c3.getid());
        System.out.println(c3.getname());
        System.out.println(c3.getdiscount());
        c3.setdiscount(50);
        System.out.println(c3);
        System.out.println("..........");
        
        
        invoice in=new invoice(100,c1,4000);
        customer c2=new customer(102,"bbb",10);
        System.out.println(in.getdata());
        System.out.println(in.getcustomer());
        System.out.println(in.getamount());
        in.setamount(7000);
        in.setcustomer(c2);
        System.out.println("name of the customer "+in.getcustomermame());
        System.out.println("amount after discount "+in.getamountafterdiscount());
        System.out.println("...........");
        
        invoice in1=new invoice(200,c3,4000);
        customer c4=new customer(103,"rrr",15);
        System.out.println(in1.getdata());
        System.out.println(in1.getcustomer());
        System.out.println(in1.getamount());
        in1.setamount(3000);
        in1.setcustomer(c4);
       
        System.out.println("name of the customer "+in1.getcustomermame());
        System.out.println("amount after discount "+in1.getamountafterdiscount());
        System.out.println("...........");
        
        
        
        
    }
    
}
class customer
{
    int id;
    String name;
    int discount;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdiscount()
    {
        return discount;
    }
    void setdiscount(int d1)
    {
        discount=d1;
    }
    public String toString()
    {
        return "ID "+id+"\nName "+name+"\nDiscount "+discount;
    }
}
class invoice
{
    int id;
    customer o;
    double amount;
    invoice (int i,customer o1,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    customer getcustomer()
    {
        return o;
    }
    void setcustomer(customer o2)
    {
        o=o2;
       
    }
    
    int getdata()
    {
        return id;
    }
    double getamount()
    {
        return amount;
    }
    void  setamount(double d)
    {
        amount=d;
        System.out.println("the changed amount "+amount);
    }
    String getcustomermame()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return( amount-(amount)*o.discount/100);
    }
    }
