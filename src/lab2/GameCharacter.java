/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author schereja
 */
public class GameCharacter {
    private String characterName;
    private String characterClass;
    private int characterLevel;
    private String characterGender;
    
    public GameCharacter(String characterName, String characterClass, String charGender){
        this.characterName= characterName;
        this.characterClass = characterClass;
        this.characterGender = charGender;
        
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getCharacterGender() {
        return characterGender;
    }

    public void setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }
    
}
