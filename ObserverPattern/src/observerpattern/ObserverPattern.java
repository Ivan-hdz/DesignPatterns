/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import Objects.Channel;
import Objects.Client;

/**
 *
 * @author ivanh
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Channel ch = Channel.getChannel();
       Client c1, c2, c3;
       c1 = new Client(ch);
       c2 = new Client(ch);
       c3 = new Client(ch);
       
       c1.setName("Cliente 1");
       c2.setName("Cliente 2");
       c3.setName("Cliente 3");
       
       ch.setPayload("Explain");
       ch.notifyObservers();
       ch.setPayload("Explain x2");
       ch.notifyObservers();
       c2.unsubscribeFromSubject();
       ch.setPayload("Explain x3");
       ch.notifyObservers();
    }
    
}
