/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author schereja
 */
public class Game {
    private String charGender;
    private String charName;
    private String charClass;
    Scanner keyboard = new Scanner(System.in);
    public Game(){
        enterName();
        enterClass();
        enterGender();
        GameWorld gw = new GameWorld();
        GameGUI gui = new GameGUI();
        GameCharacter gc1 = new GameCharacter(charName, charClass, charGender);
    
    }
    
    private void verifyGender(String gender){
        if ("M".equals(gender) || "F".equals(gender)){
            System.out.println("You entered " + gender + ".");
            
        } else{
            System.out.println("Please enter a valid Gender.");
            enterGender();
        }
            
    }
    private void enterName(){
        System.out.println("Please enter your player's name:");
        String charName = keyboard.nextLine();
    }
    private void enterClass(){
            System.out.println("Please enter character class:");
            String charClass = keyboard.nextLine();
    }
    private void enterGender(){
           System.out.println("Please enter M or F for gender:");
           String charGender = keyboard.next();
           verifyGender(charGender);
    }
}
