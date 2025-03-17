package laba9.task2;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (in.hasNextInt()) {
            int number = in.nextInt();
            if (number == 0) {
                System.out.println("Двоичное представление: 0");
            } else {
                int absNumber = Math.abs(number);
                System.out.print("Двоичное представление: ");
                System.out.println(toBinary(absNumber));
            }
        } else {
            System.out.println("Ошибка: зачем Вам переводить текст?).");
        }

        in.close();
    }

    public static String toBinary(int n) {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }
}

