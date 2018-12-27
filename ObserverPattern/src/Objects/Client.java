/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Interfaces.Observer;
import Interfaces.Subject;

/**
 *
 * @author ivanh
 */
public class Client implements Observer {

    String name;
    Subject subject;
    public Client(Subject s) {
        subject = s;
        subject.subscribe(this);
    }
    
    public void setName(String s) { name = s; }
    
    public String getName(){
        return name;
    }
    
    public void unsubscribeFromSubject() {
        subject.unsubscribe(this);
    }
    
    public void setSubject(Subject s) {
        subject = s;
    }
    
    public Subject getSubject() {
        return subject;
    }
    
    @Override
    public void update() {
        System.out.println(getName() + " > " + getSubject().getPayload().toString());
    }
    
}
