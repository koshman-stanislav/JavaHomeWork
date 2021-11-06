package com.pb.koshman.hw6;

public class VetClinic {
    public static void main(String[] args) throws Exception{

    Animal animal = new Animal();

    Dog dog1 = new Dog("нога почтальена", "улица",5);
    Dog dog2 = new Dog("кость","переулок",0);
    Dog dog3 = new Dog("нога почтальена","улица",5);

        System.out.println("equals dog 1 dog3:" + dog1.equals(dog3));
        System.out.println("equals dog 2 dog3:" + dog2.equals(dog3));
        System.out.println("equals dog 1 dog2:" + dog1.equals(dog2));
        System.out.println("hashCodes Собак:");
        System.out.println("hashCode dog1 " + dog1.hashCode());
        System.out.println("hashCode dog2 " + dog2.hashCode());
        System.out.println("hashCode dog3 " + dog3.hashCode());

    Cat cat1 = new Cat("Gurme gold","Квартира",15);
    Cat cat2 = new Cat("Sheba","Дом",1);
    Cat cat3= new Cat("KiteKat","Вокзал",1);

        System.out.println("equals cat1 cat2:" + cat1.equals(cat2));
        System.out.println("equals cat1 cat3:" + cat1.equals(cat3));
        System.out.println("equals cat2 cat3:" + cat2.equals(cat3));
        System.out.println("hashCodes Собак:");
        System.out.println("hashCode cat1 " + cat1.hashCode());
        System.out.println("hashCode cat2 " + cat2.hashCode());
        System.out.println("hashCode cat3 " + cat3.hashCode());

    Horse horse = new Horse("Яблока","Иподром",5);

        animal.eat();
        horse.eat();

        Class vetClazz = Class.forName("com.pb.koshman.hw6.Veterinarian");
        Constructor constr = vetClazz.getDeclaredConstructor(new Class[] {});
        Constructor constr = vetClazz.getConstructor(new Class[] {});
        Object obj = constr.newInstance();

        Animal[] animals = new Animal[]{dog3,cat2,horse};
        for(Animal a: animals){
            if(obj instanceof Veterinarian)
                ((Veterinarian) obj).treatAnimal(a);
        }
    }
}
