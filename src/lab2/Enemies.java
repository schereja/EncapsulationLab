/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author schereja
 */
public class Enemies {
    private int hp;
    private int mana;
    private int speed;
    
    public Enemies(int choice){
        switch(choice){
            case 1: goblin();
                    break;
            case 2: imp();
                    break;
        }
       
    }
    private void goblin(){
        System.out.println("You are fighting a goblin");
    }
    private void imp(){
        System.out.println("You are fighting an imp");
    }
    
}
