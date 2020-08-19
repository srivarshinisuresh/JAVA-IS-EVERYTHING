/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journal;

/**
 *
 * @author POOJHA KEERTHI
 */
public class journaldetails {
    public int journalid[]={101,102,103,104,105};
    public String journalname[]={"Computer Science Journal","Artificial Intelligence Journal","Information Technology Journal","CSE jounal","IT Journal"};
    public void display(int i)
    {
        System.out.println("Journal name ; "+journalname[i]+"\nJournal Id : "+journalid[i]);
    }
}
