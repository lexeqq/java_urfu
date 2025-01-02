package laba3;
import java.util.Random;
import java.util.Scanner;
// Напишите программу, в которой создается массив и заполняется случайными числами.
// Массив отображается в консольном окне.
// В этом массиве необходимо определить элемент с минимальным значением.
// В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
// Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int amount = in.nextInt();
        Random r = new Random();
        int[] massive = new int[amount];
        int min = 10;
        for (int i = 0; i < amount ; i++) {
            massive[i] = r.nextInt(10);
            System.out.print(massive[i] +" ");
        }
        System.out.println(" ");
        for (int i = 0; i < amount ; i++) {
            if (massive[i] < min) {
                min = massive[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " +min);
        System.out.print("Индекс минимальных значений: ");
        for (int i = 0; i < amount ; i++) {
            if (massive[i] == min) {
                System.out.print(i+ " ");
            }
        }
    }
}