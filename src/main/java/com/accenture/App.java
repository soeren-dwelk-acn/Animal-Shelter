package com.accenture;

import com.accenture.animals.Animal;
import com.accenture.animals.comparators.AnimalJoinedComparator;
import com.accenture.animals.comparators.AnimalNameComparator;
import com.accenture.animals.comparators.AnimalSpeciesComparator;
import com.accenture.commands.AddCommand;
import com.accenture.commands.Command;
import com.accenture.commands.ExitCommand;
import com.accenture.commands.ShowCommand;
import com.sun.source.tree.Tree;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        App.run();
    }

    public static void run() {

        SortedSet<Animal> animalSet = new TreeSet<Animal>(new AnimalSpeciesComparator());
        animalSet.add(new Animal("cthulu", "ainthuman", LocalDateTime.of(2020, 3, 15, 1, 2, 3)));
        animalSet.add(new Animal("bob", "boomer", LocalDateTime.of(2012, 1, 1, 14, 30, 0)));
        animalSet.add(new Animal("andy", "child", LocalDateTime.of(2024, 6, 1, 12, 0, 20)));
        animalSet.add(new Animal("diddy", "fish", LocalDateTime.of(2023, 6, 1, 12, 0, 20)));
        animalSet.add(new Animal("eddy", "donkey", LocalDateTime.of(2022, 6, 1, 12, 0, 20)));
        animalSet.add(new Animal("fritz", "eagle", LocalDateTime.of(2021, 6, 1, 12, 0, 20)));

        System.out.println(animalSet);

        AnimalShelter animalShelter = new AnimalShelter();
        Scanner scanner = new Scanner(System.in);
        final Command exitCommand = new ExitCommand();
        final Command showCommand = new ShowCommand(animalShelter);
        final Command addCommand = new AddCommand(animalShelter);

        final List<Command> commands = List.of(exitCommand, showCommand, addCommand);

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("(add) add animal to shelter");
            System.out.println("(show) show animals from shelter");
            System.out.println("(exit) exit the application");
            System.out.println("> ");
            final String input = scanner.nextLine();
            for (Command command : commands) {
                if (command.shouldRun(input)) {
                    command.execute();
                }
            }
        }
    }
}
