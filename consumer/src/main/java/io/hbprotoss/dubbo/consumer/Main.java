package io.hbprotoss.dubbo.consumer;

import io.hbprotoss.dubbo.provider.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hbprotoss on 4/6/16.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:consumer.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService");
        String echo = demoService.echo("hello");
        System.out.println(echo);
    }
}
