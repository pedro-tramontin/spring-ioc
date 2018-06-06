package br.com.pedront.spring.ioc;

import br.com.pedront.spring.ioc.service.HelloWord;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWord helloService = ctx.getBean(HelloWord.class);
        helloService.sayHello();
    }

}
