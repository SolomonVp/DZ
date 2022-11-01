package org.example;

public class Owner {
    Car car;
    String color;
    int maxSpeed;

    public Owner() {
        System.out.println("--- Bean owner is created");
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void poraDomoy() {
        System.out.println("Взываю тачку!");
        car.go();
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        System.out.println("--- Class Person: set Color ");
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        System.out.println("--- Class Person: set MaxSpeed ");
        this.maxSpeed = maxSpeed;
    }


}
