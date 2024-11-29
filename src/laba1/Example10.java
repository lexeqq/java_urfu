package laba1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    // Напишите программу, в которой Пользователь вводит имя и год рождения,
    // программа отображает сообщение содержащее имя пользователя и его возраст.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш год рождения:");
        int birthYear = scanner.nextInt();

        Year currentYear = Year.now();
        int currentYearInt = currentYear.getValue();

        int ageOfBirthday = currentYearInt - birthYear;

        System.out.println("ваш возраст: " + ageOfBirthday + " лет");

        scanner.close();
    }
}