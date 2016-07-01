package vezzoni.rmi.spring.server;

public class GreetingsImpl implements Greetings {

    @Override
    public String sayHello() {
        return "hello world!";
    }
    
}
