package com.accenture.animals;


import java.time.LocalDateTime;
import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private final String name;
    private final String species;

    private final LocalDateTime joined;
    public Animal(String name, String species, LocalDateTime joined) {
        this.name = name;
        this.species = species;
        this.joined = joined;
    }

    public void makeSound() {}

    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + this.name + '\'' +
                ", species='" + this.species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(this.name, animal.name) && Objects.equals(this.species, animal.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(17*this.name.hashCode(), 97*this.species.hashCode());
    }

    public LocalDateTime getJoined() {
        return joined;
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.getName());
    }
}