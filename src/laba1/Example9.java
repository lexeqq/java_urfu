package laba1;

import java.util.Scanner; // Импортируем класс Scanner, который считывает данные из разных источников,в нашем случае с клавиатуры
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Используем класс Scanner, который считывает данные с метода System.in

        System.out.println("Введите название текущего месяца: "); // Ввод названия месяца
        String month = in.nextLine();

        System.out.println("Введите количество в этом месяце: "); // Ввод количества дней в месяце
        int quantity = in.nextInt();

        System.out.printf(month + " состоит из " + quantity + " дней"); // Выводим сообщение с введенными в консоль данными
        in.close();
    }
}