package laba4;
// Напишите программу, которая выводит в консольное окно
// прямоугольный треугольник
public class Example2 {
    public static void main(String[] args) {
        int height = 10; // Длина большего катета

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
