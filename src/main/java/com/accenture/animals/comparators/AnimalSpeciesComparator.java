package com.accenture.animals.comparators;

import com.accenture.animals.Animal;

import java.util.Comparator;

public class AnimalSpeciesComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getSpecies().compareTo(o2.getSpecies());
    }
}
