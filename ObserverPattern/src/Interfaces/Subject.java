/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author ivanh
 */
public interface Subject {
    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers();
    Object getPayload();
    void setPayload(Object o);
}
