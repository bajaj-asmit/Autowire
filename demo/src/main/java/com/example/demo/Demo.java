package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Demo {

    Dev dev;
    public Demo(Dev dev)
    {
        this.dev=dev;
    }

    public void handleRequest()
    {
        dev.build();
    }
}
