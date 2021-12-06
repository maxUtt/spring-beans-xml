package com.kondratsenko;

import com.kondratsenko.model.Cat;
import com.kondratsenko.model.Dog;
import com.kondratsenko.model.Elephant;
import com.kondratsenko.model.Zoo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppWithProperties
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-properties.xml");
        //context.registerShutdownHook();
        Zoo myZoo = context.getBean("zoo", Zoo.class);
        myZoo.print();
        context.close();
    }
}
