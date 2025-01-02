package laba3;
import java.util.Random;
import java.util.Scanner;
//Напишите программу, в которой создается целочисленный массив,
//заполняется случайными числами и после этого значения элементов
//в массиве сортируются в порядке убывания значений.
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int amount = in.nextInt();
        Random r = new Random();
        int[] massive = new int[amount];
        int i;
        for (i = 0; i < amount; i++) {
            massive[i] = r.nextInt(10);
            System.out.print(massive[i] + " ");
        }
        for(i = massive.length-1 ; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (massive[j] < massive[j + 1]) {
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
        System.out.println(" ");
        System.out.print("Произведена сортировка массива:");
        for (i = 0 ; i < massive.length ; i++ ){
            System.out.print( massive[i]+" ");
        }
    }
}
