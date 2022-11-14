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
public class FireType extends Monster {
    public FireType(String n, int b){
        super("Chamander", "Fire", "Grass", "Water", 75, b);
        atk = 1.3 * b;
        def = 0.7 * b;
    }
    

    public void special(){
        atk += 2;
        hp -= maxHP * 0.1;
    }
}
