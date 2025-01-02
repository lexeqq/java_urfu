package laba3;
import java.util.Scanner;
//Напишите программу, в которой пользователю предлагается ввести название дня недели.
//По введенному названию программа определяет порядковый номер дня в неделе.
//Если пользователь вводит неправильное название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов
//и на основе оператора выбора switch.
public class Example2_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String day = in.nextLine();
        switch (day) {
            case "Понедельник":
                System.out.println("Понедельник это 1й день недели");
                break;
            case "Вторник":
                System.out.println("Вторник это 2й день недели");
                break;
            case "Среда":
                System.out.println("Среда это 3й день недели");
                break;
            case "Четверг":
                System.out.println("Четверг это 4й день недели");
                break;
            case "Пятница":
                System.out.println("Пятница это 5й день недели");
                break;
            case "Суббота":
                System.out.println("Суббота это 6й день недели");
                break;
            case "Воскресенье":
                System.out.println("Воскресенье это 7й день недели");
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
