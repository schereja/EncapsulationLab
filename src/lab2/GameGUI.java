/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author schereja
 */
public class GameGUI {
    private int move = 0;
    private int attack = 0;
    private int inventory = 0;
    
    public void move(int move){
        if(move == 0){
         rightMove();
        }
        else if (move==1){
         leftMove();
        }
      
      
    }
    public void attack(int attack){
        switch(attack){
            case 1:cut();
                   break;
            case 2:stab();
                   break;
        }
        
    }
    public void inventory(){
        
    }
    private String rightMove(){
        return "Right";
    }
    private String leftMove(){
        return "Left";
    }
    private String forwardMove(){
        return "Forward";
    }
    private String reverseMove(){
        return "Reverse";
    }
    private String cut(){
        return "You have been cut.";
    }
    private String stab(){
        return "You have been stabbed.";
    }
}
