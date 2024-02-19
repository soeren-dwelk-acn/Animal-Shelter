package com.accenture.animals;

import com.accenture.animals.Animal;

import java.time.LocalDateTime;

public class Dog extends Animal {
    public Dog(String name, String species) {
        super(name, species, LocalDateTime.now());
    }
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
