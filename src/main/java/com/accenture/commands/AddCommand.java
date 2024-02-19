package com.accenture.commands;

import com.accenture.animals.Animal;
import com.accenture.AnimalShelter;

import java.time.LocalDateTime;
import java.util.Scanner;

public class AddCommand implements Command {

    private AnimalShelter animalShelter;

    public AddCommand(AnimalShelter animalShelter){
        this.animalShelter = animalShelter;
    }

    @Override
    public void execute() {
        this.animalShelter.addAnimal(AddCommand.makeAnimal());
    }

    @Override
    public boolean shouldRun(String command) {
        return "add".equals(command);
    }
    public static Animal makeAnimal() {
        Scanner scanner = new Scanner(System.in);
        String name, species;
        System.out.println("What's the animals species?");
        species = scanner.next();
        System.out.println("What's the " + species + "s name?");
        name = scanner.next();
        return new Animal(name, species, LocalDateTime.now());
    }
}
