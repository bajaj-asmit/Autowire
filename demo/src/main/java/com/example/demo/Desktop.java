package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("Desktop")
public class Desktop implements  Computer{
    @Override
    public void compile() {
        System.out.println("This is a desktop error");
    }
}
