package vezzoni.rmi.spring.client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vezzoni.rmi.spring.server.Greetings;

public class Main {

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        for (String serviceName : registry.list()) {
            System.out.println(serviceName);
        }
        
        System.out.println();
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-client.xml");
        
        Greetings service = (Greetings) context.getBean("greetingsService");
        String message = service.sayHello();
        
        System.out.println("> " + message);
    }
}
