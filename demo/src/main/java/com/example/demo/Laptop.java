package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component("Laptop")
public  class Laptop implements  Computer{
    @Override
    public void compile() {
        System.out.println("compiler error in Laptop");
    }
}
