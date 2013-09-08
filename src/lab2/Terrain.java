/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author schereja
 */
public class Terrain {
    private int sight;
    private int speed;
    
    public Terrain(int choice){
        switch(choice){
            case 1: plains();
                    break;
            case 2: water();
                    break;
        }
       
    }
    private void plains(){
        
    }
    private void water(){
        
    }
    
}
