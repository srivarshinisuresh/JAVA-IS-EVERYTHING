/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
 class box1
{
    double height;
    double width;
    double depth;
    double vol;
    void volume()
    {
        vol=depth*height*width;
        System.out.println("volume "+vol);
    }
    
    }

/**
 *
 * @author NEW
 */
public class heightwidthdepth2 {
    public static void main(String args[]){
        box1 obj1=new box1();
        obj1.depth=5;
        obj1.height=10;
        obj1.width=15;
        obj1.volume();
}
}

        