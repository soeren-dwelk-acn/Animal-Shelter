package com.accenture;
import com.accenture.animals.Animal;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

public class AnimalShelter {
    private List<Animal> animals;

    AnimalShelter() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void showAnimals() {
        System.out.println();
        DateTimeFormatter myDTF = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
//        System.out.println("Number of animals in the shelter: " + this.animals.size());
        for (Animal animal : this.animals) {
            System.out.println(animal.getName() + " (" + animal.getSpecies() + "), joined: " + animal.getJoined().format(myDTF));
        }
        System.out.println();
    }

}
