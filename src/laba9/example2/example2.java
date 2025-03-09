package laba9.example2;
import java.util.Scanner;

// Создать приложение с использованием рекурсии для перевода
//целого числа, введенного с клавиатуры, в двоичную систему счисления.

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое хотите перевести в двоичную систему:");

        int DecimalNumber = in.nextInt();

        in.close();

        System.out.println("Двоичное представления числа: ");
        printBinary(DecimalNumber);
        System.out.println();
    }
    // Создаем рекурсивную функцию printBinary
    public static void printBinary (int DecimalNumber) {
        // 1)Если введенное число равно 0, рекурсия останавливается
        // 2)Вызывается DecimalNumber / 2, обрабатывая оставшуюся часть числа
        if(DecimalNumber > 0) {
            printBinary(DecimalNumber / 2);
            // Выводится DecimalNumber % 2, которое дает остаток от деления на 2, то есть 0 или 1, что и представляет собой двоичную цифру
            System.out.print(DecimalNumber % 2);
        }
    }
}
