package laba3;

import java.util.Scanner;
// Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
// при делении числа на 5 в остатке получается 2,
// или при делении на 3 в остатке получается 1
// Количество чисел в сумме вводится пользователем.
// Программа отображает числа, которые суммируются, и значение суммы.
// Предложите версии программы, использующие разные операторы цикла.
public class Example5_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int count = in.nextInt();
        int[] arr = new int[count];
        int amount_of_numbers = 0;
        for (int i = 0; amount_of_numbers < count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                arr[amount_of_numbers] = i;
                amount_of_numbers += 1;
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Сумма чисел " + sum);
    }
}
