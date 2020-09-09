/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author POOJHA KEERTHI
 */
public class employeearraylist {
    public static void main(String[] args) {
        // TODO code application logic here
        employee e1=new employee("raj",20000);
        //System.out.println(e1);
        ArrayList<employee> list=new ArrayList<>();
        list.add(e1);
        list.add(new employee("keerthi",65000));
        list.add(new employee("ravi",22700));
        list.add(new employee("adithiya",35000));
        list.add(new employee("poorana",45000));
        list.add(new employee("hari",50000));
        list.add(new employee("kumari",55000));
        list.add(new employee("yazhini",60000));
        list.add(new employee("meena",15000));
        list.add(new employee("sakthi",5000));
        list.add(new employee("dhakshni",37500));
        list.add(new employee("rosyla",25000));
        list.add(new employee("karthick",30000));
        list.add(new employee("valli",10000));
        list.add(new employee("suresh",40000));
        list.add(new employee("vyas",38300));
        list.add(new employee("bharat",27900));
        list.add(new employee("raksha",41000));
        list.add(new employee("poojha",55300));
        list.add(new employee("charan",58500));
        System.out.println("THE LIST IS : ");
        System.out.println(list);
        Collections.sort(list,new namesort());
        System.out.println("THE LIST SORTED BY NAME IS : ");
        System.out.println(list);
    }
    
}
class employee
{
    String name;
    double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nEmployee Name:"+name+"\tSalary:"+salary;
    }
}
class namesort implements Comparator<employee>
{
   
    public int compare(employee e1,employee e2)
    {
        return e1.name.compareTo(e2.name);
    }
}


