package com.company;

import java.io.Serializable;

// <T> - псевдоним существующего типа
// в качестве псевдонима может использоваться только ссылочный тип данных
public class Dog<T, E extends Number & Serializable> {
    public T id;
    private E gender;

    public E getGender() {
        return this.gender;
    }

    public void setGender(E gender) {
        this.gender = gender;
    }

    public <K> void haw(K voice) {
        System.out.println(voice);
    }
}
