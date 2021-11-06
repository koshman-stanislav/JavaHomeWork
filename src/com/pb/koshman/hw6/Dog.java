package com.pb.koshman.hw6;

import java.util.Objects;

public class Dog extends Animal {
    int bittenPostmen;

    public Dog(String food, String location, int bittenPostmen){
        super(food, location);
        this.bittenPostmen = bittenPostmen;
    }
    @Override
    public void makeNoise(){
        System.out.println("Песель рычит");
    }
    @Override
    public void eat(){
        System.out.println("Песель ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return bittenPostmen == dog.bittenPostmen && Objects.equals(getFood(),dog.getFood())
                && Objects.equals(getLocation(),dog.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bittenPostmen);
    }

    @Override
    public String toString() {
        return "Dog(" +
                "Укушеных почтальенов: " + bittenPostmen +
                ')';
    }

}
