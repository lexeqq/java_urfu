package laba3;
import java.util.Scanner;
//Напишите программу, которая выводит последовательность чисел Фибоначчи.
//Первые два числа в этой последовательности равны 1,
//а каждое следующее число равно сумме двух предыдущих
//(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//Количество чисел в последовательности вводится пользователем.
//Предложите версии программы, использующие разные операторы цикла.
public class Example3_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int n = in.nextInt();
        int prev = 0;
        int next = 1;
        System.out.println(next + " ");
        int count = 2;
        do {
            int temp = next;
            next = prev + next;
            prev = temp;
            System.out.println(next + " ");
            count++;
        } while (count <= n);
    }
}