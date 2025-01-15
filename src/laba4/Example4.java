package laba4;
// Напишите программу, где создается двумерный массив,
// который выводит прямоугольный треугольник
public class Example4 {
    public static void main(String[] args) {
        int size = 9; // Длина катетов
        char[][] triangle = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '@';
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
