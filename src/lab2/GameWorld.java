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
    private String enemy;
    private String terrain;
    private int randNumb;
    
    public GameWorld(){
        randomNumber(3);
        generateEnemies(randNumb);
        randomNumber(4);
        generateTerrain(randNumb);
    }
    private int randomNumber(int value){
        Random randomNumber = new Random();
        randNumb = randomNumber.nextInt(value);
        return randNumb;
    }
    private void generateEnemies(int randNumb){
        Enemies emy = new Enemies(randNumb);
        //Imp, slime, Goblin
    }
    private void generateTerrain(int randNumb){
         Terrain trn = new Terrain(randNumb);
        //plains, forest, water, beach
    }
    
}
