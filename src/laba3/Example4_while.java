package laba3;
import java.util.Scanner;
//Напишите программу, в которой пользователем вводится два целых числа.
//Программа выводит все целые числа — начиная с наименьшего(из двух введенных чисел)
//и заканчивая наибольшим (из двух введенных чисел).
//Предложите разные версии программы (с использованием разных операторов цикла).
public class Example4_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int first = in.nextInt();
        int second = in.nextInt();
        int min = Math.min(first, second);
        int max = Math.max(first, second);
        int a = min;
        while (a <= max) {
            System.out.println(a);
            a++;
        }
    }
}
