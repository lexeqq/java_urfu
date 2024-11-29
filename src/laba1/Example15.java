package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое числовое значение:");
        int firstnumber = scanner.nextInt();

        System.out.println("Введите второе числовое значение:");
        int secondnumber = scanner.nextInt();

        System.out.println(firstnumber + secondnumber);
        System.out.println(firstnumber - secondnumber);
    }
}