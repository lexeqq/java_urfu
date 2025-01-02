package laba3;
import java.util.Scanner;
//Напишите программу, в которой пользователем вводится два целых числа.
//Программа выводит все целые числа — начиная с наименьшего(из двух введенных чисел)
//и заканчивая наибольшим (из двух введенных чисел).
//Предложите разные версии программы (с использованием разных операторов цикла).
public class Example4_if_else {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int first = in.nextInt();
        int second = in.nextInt();
        if (first < second) {
            System.out.println(first);
            for (int i = first + 1; i < second + 1; i++) {
                System.out.println(i);
            }
        }
            else {
            System.out.println(second);
            for(int i = second + 1; i < first + 1; i++) {
                System.out.println(i);
            }

        }
    }
}
