package laba1;

import java.util.Scanner; // Импортируем класс Scanner, который считывает данные из разных источников,в нашем случае с клавиатуры
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Используем класс Scanner, который считывает данные с метода System.in

        System.out.println("Введите имя: "); // Выводим соообщение для ввода имени
        String name = in.nextLine();

        System.out.println("Введите возраст: "); // Выводим сообщение для ввода возраста
        int age = in.nextInt();

        System.out.printf("Имя: %s \nВозраст: %d", name, age); // Выводим сообщение с введенными в консоль данными
        in.close();
    }
}