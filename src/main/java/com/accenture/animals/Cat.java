package com.accenture.animals;

import com.accenture.animals.Animal;

import java.time.LocalDateTime;

public class Cat extends Animal {
    public Cat(String name, String species) {
        super(name, species, LocalDateTime.now());
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
