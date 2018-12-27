/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ducks;

import DuckBehavours.FlyNoWay;
import DuckBehavours.Squack;

/**
 *
 * @author ivanh
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        this.flyBehavour = new FlyNoWay();
        this.quackBehavour = new Squack();
    }
}
