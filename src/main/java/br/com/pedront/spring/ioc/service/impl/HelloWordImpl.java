package br.com.pedront.spring.ioc.service.impl;

import br.com.pedront.spring.ioc.service.HelloWord;
import org.springframework.stereotype.Service;

@Service
public class HelloWordImpl implements HelloWord {

    @Override
    public String getHello() {
        return "Hello World!";
    }

    @Override
    public void sayHello() {
        System.out.println(getHello());
    }
}
