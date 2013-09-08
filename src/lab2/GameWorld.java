/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;
/**
 *
 * @author schereja
 */
public class GameWorld {
    
    private void generateEnemies(){
        Random randomNumber = new Random();
        int randNumb = randomNumber.nextInt(3)+1;
        
        //Imp, slime, Goblin
    }
    private void generateTerrain(){
            Random randomNumber = new Random();
        int randNumb = randomNumber.nextInt(4)+1;
        //plains, forest, water, beach
    }
    
}
