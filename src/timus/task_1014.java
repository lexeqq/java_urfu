package timus;

import java.io.*;
import java.util.*;

class MinimalQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        // Если N равно 0, то минимальное число Q = 10
        if (N == 0) {
            System.out.println(10);
            return;
        }

        // Если N равно 1, минимальное число Q = 1
        if (N == 1) {
            System.out.println(1);
            return;
        }

        List<Integer> digits = new ArrayList<>();

        // Пробуем разложить N на множители от 9 до 2
        for (int i = 9; i >= 2; i--) {
            while (N % i == 0) {
                digits.add(i);
                N /= i;
            }
        }

        // Если N не равно 1, то разложить его невозможно
        if (N != 1) {
            System.out.println(-1);
            return;
        }

        // Сортируем цифры для минимизации числа
        Collections.sort(digits);

        // Формируем минимальное число Q из полученных цифр
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }
        System.out.println(result);
    }
}
