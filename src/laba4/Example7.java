package laba4;
// Напишите программу, в которой создается двумерный
// числовой массив и этот массив заполняется «змейкой»:
// сначала первая строка (слева направо), затем последний
// столбец (сверху вниз), вторая строка (справа налево) и так далее.
public class Example7 {
    public static void main(String[] args) {
        int lines = 6; // Количество строк
        int columns = 6; // Количество столбцов
        int[][] snakeArray = new int[lines][columns];

        int num = 1; // Начальное значение

        for (int i = 0; i < lines; i++) {
            boolean isLineEven = (i % 2 == 0); // Проверка на четность

            if (isLineEven) {
                // Если строка чётная, заполняем слева направо
                for (int j = 0; j < columns; j++) {
                    snakeArray[i][j] = num++;
                }
            } else {
                // Если строка нечётная, заполняем справа налево
                for (int j = columns - 1; j >= 0; j--) {
                    snakeArray[i][j] = num++;
                }
            }
        }

        printArray(snakeArray);
    }

    public static void printArray(int[][] array) {
        for (int[] line : array) {
            for (int value : line) {
                System.out.printf("%3d ", value);
            }
            System.out.println();
        }
    }
}