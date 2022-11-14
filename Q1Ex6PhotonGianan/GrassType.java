/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06photongianansam;

/**
 *
 * @author PHOTON
 */
public class GrassType extends Monster {
    public GrassType(String n, int b){
        super("Bulbasaur", "Grass", "Water", "Fire", 75, b);
        atk = b;
        def = b;
    }
    
    public void rest(){
       hp += maxHP * 0.5;
    }
    public void special(){
        hp += maxHP * 0.2;
    }
}
