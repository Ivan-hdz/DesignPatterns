/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import DuckBehavours.FlyWithWings;
import DuckBehavours.Quack;

/**
 *
 * @author ivanh
 */
public class ImperialDuck extends Duck{
    public ImperialDuck() {
        this.flyBehavour = new FlyWithWings();
        this.quackBehavour = new Quack();
    }
}
