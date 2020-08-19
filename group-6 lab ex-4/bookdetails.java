/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author POOJHA KEERTHI
 */
public class bookdetails {
    public int bookid[]={001,002,003,004,005};
    public int accessionno[]={164867,485978,257857,967342,853758};
    public int pub[]={1978,1987,1956,1967,1984};
    public String bookname[]={"Twilight","HarryPotter","PercyJackson","Hungergames","Divergent"};
    public String authorname[]={"StephineMeyer","J.K.Rowling","RickRiordan","SuzanneWright","Divergent"};
    public void display(int i)
    {
        System.out.println("Book name ; "+bookname[i]+"\nAuthor : "+authorname[i]+"\nBook Id : "+bookid[i]);
        System.out.println("Accession number : "+accessionno[i]+"\nPublication : "+pub[i]);
    }
}
