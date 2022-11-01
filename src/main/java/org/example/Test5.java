package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        BMW myBMW = context.getBean("myCar", BMW.class);
        BMW yourBMW = context.getBean("myCar", BMW.class);

        myBMW.go();
        yourBMW.go();

        context.close();
    }
}
