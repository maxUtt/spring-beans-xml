package com.kondratsenko;

import com.kondratsenko.model.Zoo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppWithXml {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //context.registerShutdownHook();
        Zoo myZoo = context.getBean("zoo", Zoo.class);
        myZoo.print();
        context.close();
    }
}
