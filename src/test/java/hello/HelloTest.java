package test.java.hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import main.java.hello.Hello;

public class HelloTest {

    private Hello hello = new Hello();

    @Test
    public void greeterSaysHello() {
      assertThat(hello.sayHello(), containsString("Hello"));
    }
    
}
