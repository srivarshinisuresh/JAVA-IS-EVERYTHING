/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author SRI
 */
public class bytestreambinaryfile {
    public static void main(String args[]) throws FileNotFoundException, IOException{
           FileInputStream fio=null;
        FileOutputStream fou=null;
        fio=new FileInputStream ("C:\\Users\\SRI\\Pictures\\Downloaded pictures\\dp.jpeg");
        fou=new FileOutputStream("C:\\Users\\SRI\\Pictures\\Downloaded pictures\\lab10_image_output.jpg");
        int i;
        while((i=fio.read())!=-1)
        {
            fou.write(i);
        }
        fou.close();
    }
}
