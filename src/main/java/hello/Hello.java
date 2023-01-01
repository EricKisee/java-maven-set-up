package main.java.hello;

import org.joda.time.LocalTime;

public class Hello {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println(sayHello());
        System.out.println("The current local time is: " + currentTime);
    }

    public static String sayHello(){
        return  "Hello World from Maven";
    }
}