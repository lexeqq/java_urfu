package laba3;
import java.util.Scanner;
// Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
// Массив заполняется буквами «через одну», начиная с буквы ' а ':
// то есть массив заполняется буквами ' а ' , ' с ' , ' е ' , ' д ' и так далее.
// Отобразите массив в консольном окне в прямом и обратном порядке.
// Размер массива задается переменной.
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива не больше 16");
        int a = in.nextInt();
        if (a <= 16) {
            char[] massive = new char[a];
            int i;
            char b = 'A';
            for (i = 0; i < a; b++) {
                if (b % 2 != 1) {
                    massive[i] = b;
                    i++;
                }
            } // значение массива по порядку
            for (i = 0; i < massive.length; i++) {
                System.out.print(massive[i]+" ");
            }
            System.out.println();
            // значение масива в обратном порядке
            for (i = massive.length-1; i >0; i--) {
                System.out.print(massive[i]+" ");
            }
        }
        else {
            System.out.print("Значение должно быть не больше 16");
        }
    }
}
