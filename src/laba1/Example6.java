package laba1;

import java.util.Scanner; // Импортируем класс Scanner
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: "); // Выводим соообщение для ввода фамилии
        String secondname = in.nextLine();

        System.out.println("Введите имя: "); // Выводим сообщение для ввода имени
        String name = in.nextLine();

        System.out.println("Введите отчество: "); // Выводим сообщение для ввода отчества
        String surname = in.nextLine();

        System.out.printf("Привет" + " " + secondname + " " + name + " " + surname); // Выводим сообщение с введенными в консоль данными
        in.close();
    }
}