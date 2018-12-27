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
public class Quack implements QuackBehavour{

    @Override
    public void quack() {
        System.out.println("I am quacking");
    }
    
}
