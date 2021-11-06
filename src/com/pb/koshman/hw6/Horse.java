package com.pb.koshman.hw6;

import java.util.Objects;

public class Horse extends Animal{
    int victoryRaces;

    public Horse(String food, String location, int victoryRaces){
        super(food, location);
        this.victoryRaces = victoryRaces;
    }
    public void makeNoise(){
        System.out.println("Дошадь ржет");
    }
    public void eat(){
        System.out.println("Лошадь ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return victoryRaces == horse.victoryRaces && Objects.equals(getFood(),horse.getFood())
                && Objects.equals(getLocation(),horse.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(victoryRaces);
    }

    @Override
    public String toString() {
        return "Horse(" +
                "Выиграл заездов: " + victoryRaces +
                ')';
    }
}
