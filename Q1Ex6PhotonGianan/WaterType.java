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
public class WaterType extends Monster {
    public WaterType(String n, int m, int b){
        super(n, "Water", "Fire", "Grass", m, b);
        atk = 0.7 * b;
        def = 1.3 * b;
    }
    

    public void special(){
        def += 2;
        hp -= maxHP * 0.1;
    }
}
