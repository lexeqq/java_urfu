package laba1;

import java.util.Scanner; // Импортируем класс Scanner, который считывает данные из разных источников,в нашем случае с клавиатуры
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Используем класс Scanner, который считывает данные с метода System.in

        System.out.println("Введите день недели: "); // Ввод дня недели
        String day = in.nextLine();

        System.out.println("Введите название текущего месяца: "); // Ввод месяца
        String month = in.nextLine();

        System.out.println("Введите текущую дату: "); // Ввод числа месяца
        int date = in.nextInt();

        System.out.printf("Сегодня " + " " + day + " " + month + " " + date +"-е"); // Выводим сообщение с введенными в консоль данными
        in.close();
    }
}