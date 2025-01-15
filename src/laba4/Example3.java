package laba4;
// Напишите программу, где создается двумерный массив,
// который выводит прямоугольник из цифр 2
public class Example3 {
    public static void main(String[] args) {
        int lines = 9; // Количество строк
        int columns = 9; // Количество столбцов
        int[][] figure = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                figure[i][j] = 2;
                System.out.print(figure[i][j] + " ");
            }
            System.out.println();
        }
    }
}