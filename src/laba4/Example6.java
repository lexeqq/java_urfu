package laba4;
// Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец
// (создается новый массив, в котором по сравнению с исходным удалена одна строка и один столбец).
// Индекс удаляемой строки и индекс удаляемого столбца определяется с помощью генератора случайных чисел.
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int lines = 5; // Количество строк
        int columns = 5; // Количество столбцов
        int[][] originalArray = new int[lines][columns];
        Random random = new Random();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                originalArray[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int lineIndexToRemove = random.nextInt(lines);
        int columnIndexToRemove = random.nextInt(columns);

        System.out.println();

        System.out.println("Будут удалена строка с индексом " + lineIndexToRemove);
        System.out.println("Будет удален столбец с индексом " + columnIndexToRemove);

        // Создание нового массива с удалённой строкой и столбцом
        int[][] reducedArray = new int[lines - 1][columns - 1];

        for (int i = 0, newI = 0; i < lines; i++) {
            if (i == lineIndexToRemove) continue;
            for (int j = 0, newJ = 0; j < columns; j++) {
                if (j == columnIndexToRemove) continue;
                reducedArray[newI][newJ] = originalArray[i][j];
                newJ++;
            }
            newI++;
        }

        System.out.println();

        System.out.println("Массив после удаления строки и столбца:");
        printArray(reducedArray);
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