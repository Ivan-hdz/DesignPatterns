/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuckBehavours;

/**
 *
 * @author ivanh
 */
public class FlyNoWay implements FlyBehavour {

    @Override
    public void fly() {
        System.out.println("I cant fly sorry");
    }
    
}
