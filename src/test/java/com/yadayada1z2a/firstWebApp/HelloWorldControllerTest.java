package com.yadayada1z2a.firstWebApp;

import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

import static org.junit.Assert.*;

public class HelloWorldControllerTest {
    @Test
    public void capitalizeTest(){
        HelloWorldController helloWorldController = new HelloWorldController();

        assertEquals("HELLO", helloWorldController.upperCase("hello"));
    }

    @Test
    public void helloTest(){
        HelloWorldController helloWorldController = new HelloWorldController();
        assertEquals("Hello World", helloWorldController.hello());
    }

    @Test
    public void reversedTest(){
        HelloWorldController helloWorldController = new HelloWorldController();
        assertEquals("Me is World Hello", helloWorldController.strReverse("Hello World is Me"));
    }

}