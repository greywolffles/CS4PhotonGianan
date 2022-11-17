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
public class Exercise06PhotonGiananSam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireType charmander = new FireType("Charmander", 75, 10);
        GrassType bulbasaur = new GrassType("Bulbasaur", 75, 10);
        WaterType squirtle = new WaterType("Squirtle", 75, 10);
        
        System.out.println("Grass vs. Fire");
        while ((bulbasaur.getHP() > 0) && (charmander.getHP() > 0)){
            bulbasaur.attack(charmander);
            charmander.attack(bulbasaur);
        }
        bulbasaur.resetHealth();
        charmander.resetHealth();
        
        System.out.println("Fire vs. Water");
        while ((charmander.getHP() > 0) && (squirtle.getHP() > 0)){
            charmander.attack(squirtle);
            squirtle.attack(charmander);
        }
        charmander.resetHealth();
        squirtle.resetHealth();
        
        System.out.println("Water vs. Grass");
        while ((squirtle.getHP() > 0) && (bulbasaur.getHP() > 0)){
            squirtle.attack(bulbasaur);
            bulbasaur.attack(squirtle);
        }
        squirtle.resetHealth();
        bulbasaur.resetHealth();
    }
}
