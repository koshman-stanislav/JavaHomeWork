package com.pb.koshman.hw6;

import java.util.Objects;

public class Cat extends Animal {
    int caughtMice;

    public Cat(String food, String location, int caughtMice){
        super(food, location);
        this.caughtMice = caughtMice;
    }

    public void makeNoise(){
        System.out.println("Кот урчит");
    }
    public void eat(){
        System.out.println("Котейка ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return caughtMice == cat.caughtMice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(caughtMice);
    }

    @Override
    public String toString() {
        return "Cat(" +
                "Поймал мышей: " + caughtMice +
                ')';
    }
}
