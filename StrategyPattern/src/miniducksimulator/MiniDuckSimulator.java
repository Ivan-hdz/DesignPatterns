/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniducksimulator;

import Ducks.Duck;
import Ducks.ImperialDuck;
import Ducks.RubberDuck;

/**
 *
 * @author ivanh
 */
public class MiniDuckSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Duck d = new ImperialDuck();
       d.performFly();
       d.performSound();
       d = new RubberDuck();
       d.performFly();
       d.performSound();
    }
    
}
