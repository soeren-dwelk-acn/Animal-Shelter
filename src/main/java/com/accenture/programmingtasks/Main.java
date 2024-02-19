package com.accenture.programmingtasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    // Task 1
    public static Map<String, Integer> countWords(String characterChain) {
        Map<String, Integer> wordCounter = new HashMap<>();
        for (String word : characterChain.split(" ")) wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
        return wordCounter;
    }

    // Task 2
    public static void addOrChangeBirthday(Map<String, LocalDateTime> birthdays, String name, LocalDateTime birthdate) {
        birthdays.put(name, birthdate);
    }
    public static void deleteBirthday(Map<String, LocalDateTime> birthdays, String name) {
        birthdays.remove(name);
    }
    public static void showBirthday(Map<String, LocalDateTime> birthdays, String name) {
        System.out.println(birthdays.get(name).format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")));
    }

    // Task 3
    public static void trackingSurvey(List<String> CandidateVotes) {
        Map<String, Integer> voteCounter = new HashMap<>();
        for (String candidate : CandidateVotes) voteCounter.put(candidate, voteCounter.getOrDefault(candidate, 0) + 1);
        System.out.println(voteCounter);
    }

    // Task 4
    public static String fileExtractor(File myFile) throws FileNotFoundException {
        String fileContent = "";
        Scanner fileScanner = new Scanner(myFile);
        while (fileScanner.hasNextLine()) fileContent += fileScanner.nextLine();
        return fileContent;
    }

    // Task 5
    public static int stringToIntConverter(String s) {
        int number = 0;
        number = Integer.parseInt(s);
        if (number < 0) throw new NumberFormatException("it's negative");
        return number;
    }

    // Task 6
    public static void bookTheaterSeat(boolean[] bookedTheaterSeats, int seatNumber) {
        if (bookedTheaterSeats[seatNumber]) throw new SeatNotAvailableException("this seat is booked already");
        bookedTheaterSeats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " successfully booked");
    }

    public static void main(String[] args) {
        try {
            // Task 1
            System.out.println(Main.countWords("Lorem String String Lorem Lorem Lorem dolor dolor sit, sed Lorem dolor  ut  et  magna "));

            // Task 2
            Map<String, LocalDateTime> birthdays = new HashMap<>();
            Main.addOrChangeBirthday(birthdays, "Hans", LocalDateTime.of(2000, 10, 3, 5, 10));
            Main.addOrChangeBirthday(birthdays, "Lee", LocalDateTime.of(1996, 5, 13, 5, 10));
            Main.addOrChangeBirthday(birthdays, null, LocalDateTime.of(1990, 3, 20, 5, 10));
            Main.addOrChangeBirthday(birthdays, null, LocalDateTime.of(1994, 5, 20, 5, 10));
            Main.showBirthday(birthdays, "Lee");
            Main.deleteBirthday(birthdays, "Lee");
            System.out.println(birthdays);

            // Task 3
            Main.trackingSurvey(List.of("Peter", "Peter", "Peter", "John", "John", "Julia"));

            // Task 4
            System.out.println(Main.fileExtractor(new File("someFile.txt")));
            System.out.println(Main.fileExtractor(new File("NonExistentFile.txt")));

            // Task 5
            System.out.println(Main.stringToIntConverter("202020"));

            // Task 6
            boolean[] bookedTheaterSeats = new boolean[100];
            Main.bookTheaterSeat(bookedTheaterSeats, 30);
            Main.bookTheaterSeat(bookedTheaterSeats, 31);
            Main.bookTheaterSeat(bookedTheaterSeats, 30);

            // Task 7
            BankAccount myBA = new BankAccount(100);
            myBA.transact(10);
            myBA.transact(-30);
            myBA.transact(-130);

        } catch (FileNotFoundException | SeatNotAvailableException | NumberFormatException | InsufficientBalanceException e){
            System.err.println(e.getMessage());
        }
    }
}
