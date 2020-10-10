  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author SRI
 */
public class charstreambinaryfile {
    public static void main(String args[]) throws Exception {
        FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("C:\\Users\\SRI\\Pictures\\Downloaded pictures\\dp.jpeg");
        fou=new FileWriter("dp_labex10_output.jpg");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
    }
}