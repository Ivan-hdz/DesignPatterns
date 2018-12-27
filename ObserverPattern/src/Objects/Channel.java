/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Interfaces.Observer;
import Interfaces.Subject;
import java.util.ArrayList;


/**
 * 
 * Implementación de los patrones de diseño Observer Pattern y Singleton Pattern
 * 
 * @author ivanh
 */
public class Channel implements Subject {

    private String content;
    private ArrayList<Observer> obs;
    //Esto es parte de Singleton Pattern
    private static Channel thisChannel;
    
    private Channel() {
        obs = new ArrayList<>();
        content = "";
    }
    // Esto es parte de Singleton Pattern
    public static Channel getChannel() {
        if(thisChannel == null)
        {
            thisChannel = new Channel();
        }
        return thisChannel;
    }
    
    @Override
    public void subscribe(Observer o) {
        obs.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        int i = obs.indexOf(o);
        obs.remove(i);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : obs) {
            o.update();
        }
    }
    
    /**
     *
     * @param s
     */
    private void setContent(String s) {
        content = s;
    }
    
    /**
     *
     * @return
     */
    private String getContent() {
        return content;
    }

    @Override
    public Object getPayload() {
        return getContent();
    }

    @Override
    public void setPayload(Object o) {
        setContent(o.toString());
    }

    
}
