/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
class box
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
public class heightwidthdepth {
    public static void main(String args[]){
        box obj=new box();
        obj.depth=10;
        obj.height=20;
        obj.width=30;
        obj.volume();
        
        /*box obj1=new box();
        obj1.depth=5;
        obj1.height=10;
        obj1.width=15;
        obj1.volume();*/
        
        
    }
                
        
        
        
    }
    
    

