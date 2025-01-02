package laba3;
import java.util.Scanner;
//Напишите программу, в которой пользователю предлагается ввести название дня недели.
//По введенному названию программа определяет порядковый номер дня в неделе.
//Если пользователь вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов
//и на основе оператора выбора switch.
public class Example2_if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String day = in.nextLine();
        if(day.equals("Понедельник"))
            System.out.println("Понедельник это 1й день недели");
        else if (day.equals("Вторник"))
            System.out.println("Вторник это 2й день недели");
        else if (day.equals("Среда"))
            System.out.println("Среда это 3й день недели");
        else if (day.equals("Четверг"))
            System.out.println("Четверг это 4й день недели");
        else if (day.equals("Пятница"))
            System.out.println("Пятница это 5й день недели");
        else if (day.equals("Суббота"))
            System.out.println("Суббота это 6й день недели");
        else if (day.equals("Воскресенье"))
            System.out.println("Воскресенье это 7й день недели");
        else {
            System.out.println("Такого дня нет");
        }
    }
}
