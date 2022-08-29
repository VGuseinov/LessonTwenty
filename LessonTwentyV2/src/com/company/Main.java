package com.company;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
	    // Generics (обобщения)


        Dog<String, Float> d1 = new Dog();
        d1.id = "Buben";
        d1.setGender(3.14f);

        Dog<Integer, Short> d2 = new Dog();
        d2.id = 12;
        d2.setGender((short)10);
        d2.haw("Hello");
        d2.haw(12);

        

        // если тип Generic явно не указан при сохздании объекта
        // то в качестве типа Generic объекта будет использоваться
        // класс Object


//        Dog d1 = new Dog();
//        d1.id = 12;
//
//        Dog d2 = new Dog();
//        d2.id = "some id";

        System.out.println(getIDLength(d1));
        System.out.println(getIDLength(d2));
    }

    public static int getIDLength(Dog dog) {
        if (dog.id instanceof String) {
            return ((String) dog.id).length();
        }
        return 4;
    }
}
