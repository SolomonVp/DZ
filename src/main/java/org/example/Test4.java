package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        BMW myBMW = context.getBean("myCar", BMW.class);
        BMW yourBMW = context.getBean("myCar", BMW.class);

        System.out.println(myBMW);
        System.out.println(yourBMW);

        myBMW.setName("ЛастЭчка");
        yourBMW.setName("ПёрЭшка");

        System.out.println(myBMW.getName());
        System.out.println(yourBMW.getName());
    }
}
