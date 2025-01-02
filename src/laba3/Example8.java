package laba3;
import java.util.Scanner;
// Напишите программу, в которой создается символьный массив из 10 элементов.
// Массив заполнить большими (прописными) буквами английского алфавита.
// Буквы берутся подряд, но только согласные (то есть гласные буквы ’ А ' , 1 Е ' и ' I '
// при присваивании значений элементам массива нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.
public class Example8 {
    public static void main(String[] args) {
        int a = 10;
        char[] massive = new char [a];
        massive [0] = 'B';
        massive [1] = 'C';
        massive [2] = 'D';
        massive [3] = 'F';
        massive [4] = 'G';
        massive [5] = 'H';
        massive [6] = 'J';
        massive [7] = 'K';
        massive [8] = 'L';
        massive [9] = 'M';
        for (int i=0; i<a; i++)
            System.out.printf(massive[i] + " ");
    }
}