package com.accenture.commands;

import com.accenture.AnimalShelter;

public class ShowCommand implements Command {

    private AnimalShelter animalShelter;

    public ShowCommand(AnimalShelter animalShelter){
        this.animalShelter = animalShelter;
    }
    @Override
    public void execute() {
        this.animalShelter.showAnimals();
    }

    @Override
    public boolean shouldRun(String command) {
        return "show".equals(command);
    }
}
