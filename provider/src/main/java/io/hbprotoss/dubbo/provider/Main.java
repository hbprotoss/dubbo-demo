package io.hbprotoss.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by hbprotoss on 4/6/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:provider.xml"});
        context.start();
        System.in.read();
    }
}
