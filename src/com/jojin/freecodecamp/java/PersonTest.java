package com.jojin.freecodecamp.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void HelloWorldTest(){
        Person Jojin = new Person();
        assertEquals(Jojin.sayHelloWorld(), "Hello World");
    }
}
