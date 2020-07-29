/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author NEW
 */
public class distancebtw2points {
    public static void main(String args[]){
        int x1=4 , x2=5 , y1=6 , y2=9;
        double dist=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between two points "+dist);
    }
    
}
