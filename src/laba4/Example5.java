package laba4;
// Напишите программу, в которой создается двумерный целочисленный массив.
// Он заполняется случайными числами.
// Затем в этом массиве строки и столбцы меняются местами:
// первая строка становится первым столбцом,
// вторая строка становиться вторым столбцом и так далее.
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int lines = 3; // Количество строк
        int columns = 5; // Количество столбцов
        int[][] firstArray = new int[lines][columns];
        Random random = new Random();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                firstArray[i][j] = random.nextInt(99);
            }
        }

        System.out.println("Исходный массив:");
        printArray(firstArray);

        System.out.println();

        int[][] secondArray = new int[columns][lines];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                secondArray[j][i] = firstArray[i][j];
            }
        }

        System.out.println("Измененный массив:");
        printArray(secondArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}
