package vezzoni.rmi.spring.server;

import java.rmi.Remote;

public interface Greetings extends Remote {

    String sayHello();
    
}
