package laba6;
// Напишите программу с классом, где есть статические методы,
// которым можно передавать произвольное количество целочисленных аргументов (или целочисленный массив).
// Методы, на основании переданных аргументов или массива,
// позволяют вычислить: наибольшее значение из набора чисел.
public class Example3 {

    public static class ClassExample3 {
        // Статический метод для вычисления наибольшего значения из произвольного количества аргументов или массива
        public static int calculateMaxValueFromSet(int... numbers) {
            int max = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        // Нахождение максимального значения среди произвольных аргументов
        int maxFromArguments = ClassExample3.calculateMaxValueFromSet(0, 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Максимальное значение среди аргументов = " + maxFromArguments);

        // Нахождение максимального значения в массиве
        int[] numbersArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int maxFromArray = ClassExample3.calculateMaxValueFromSet(numbersArray);
        System.out.println("Максимальное значение массива = " + maxFromArray);
    }
}