package org.example;

public class BMW implements Car{
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public BMW() {
        System.out.println("--- bmw bean is created");
    }

    public void go() {
        System.out.println("Я BMW, я поехала");
    }
}
