package laba1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числовое значение:");
        int usernumber = scanner.nextInt();

        int firstnumber = usernumber - 1;
        int secondnumber = usernumber + 1;
        int value = (firstnumber + secondnumber + usernumber);
        int lastnumber = (value*value);
        System.out.printf("%d %d %d %d", firstnumber, usernumber, secondnumber, lastnumber);
    }
}