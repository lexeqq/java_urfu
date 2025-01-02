package laba3;
import java.util.Scanner;
//Напишите программу, которая выводит последовательность чисел Фибоначчи.
//Первые два числа в этой последовательности равны 1,
//а каждое следующее число равно сумме двух предыдущих
//(получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//Количество чисел в последовательности вводится пользователем.
//Предложите версии программы, использующие разные операторы цикла.
public class Example3_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int count = in.nextInt();
        int[] arr = new int[count];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];}
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
