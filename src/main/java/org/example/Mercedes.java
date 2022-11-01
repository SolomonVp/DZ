package org.example;

public class Mercedes implements Car{
    public Mercedes() {
        System.out.println("--- mercedes bean is created");
    }

    public void go() {
        System.out.println("Я Mercedes, я поехала!");
    }
}
