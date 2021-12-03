package com.kondratsenko;

import com.kondratsenko.model.Zoo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppWithXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Zoo myZoo = context.getBean("zoo", Zoo.class);
        myZoo.print();
    }
}
