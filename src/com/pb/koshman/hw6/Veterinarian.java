package com.pb.koshman.hw6;

public class Veterinarian {
    public Veterinarian(){
    }
    public void treatAnimal(Animal animal){
        System.out.println("К ветеренару поступил " + animal + ". " +
                "любит есть - " + animal.getFood() + ", " + "место прибывания - " + animal.getLocation());
    }
}
