package com.pb.koshman.hw6;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public Animal() {
    }
    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("издает звук");
    }
    public void eat(){
        System.out.println("ест");
    }
    public void sleep(){
        System.out.println("прилег отдохнуть");
    }
}
