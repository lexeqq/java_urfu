package laba6;

import java.util.Arrays;

public class Example9 {
    // Напишите программу со статическим методом, аргументом которому передается
    // одномерный символьный массив. В результате вызова метода элементы массива попарно
    // меняются местами: первый — с последним, второй — с предпоследним и так далее.
    public static class ClassExample9 {
        // Статический метод для попарной перестановки элементов символьного массива
        public static char[] swapCharArrayElements(char[] array) {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Ошибка: массив не должен быть null или пустым.");
            }

            int length = array.length;

            for (int i = 0; i < length / 2; i++) {
                int firstIndex = i;
                int lasttIndex = (length - 1) - i;
                char leftCharElement = array[firstIndex];
                char rightCharElement = array[lasttIndex];

                array[firstIndex] = rightCharElement;
                array[lasttIndex] = leftCharElement;
            }

            return array;
        }
    }

    public static void main(String[] args) {
        char[] charArray = {'Ш', 'а', 'л', 'а', 'ш', ' ', 'Д', 'о', 'в', 'о', 'д'};

        // Попарная перестановка элементов массива
        char[] swappedArray = ClassExample9.swapCharArrayElements(charArray);
        System.out.println("Массив после перестановки: " + Arrays.toString(swappedArray));
    }
}