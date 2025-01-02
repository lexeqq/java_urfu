package laba3;
import java.util.Scanner;
// Напишите программу, в которой вычисляется сумма чисел, удовлетворяющих таким критериям:
// при делении числа на 5 в остатке получается 2,
// или при делении на 3 в остатке получается 1
// Количество чисел в сумме вводится пользователем.
// Программа отображает числа, которые суммируются, и значение суммы.
// Предложите версии программы, использующие разные операторы цикла.
public class Example5_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int a = in.nextInt();
        int n = 0;
        int sum = 0;
        int i = 1;
        while (n < a) {
            if (i%5==2 & i%3==1)
        { System.out.printf("%d ", +i);
            sum+= i;
            n++;
        }
            i++;}
        System.out.printf("%nСумма: %d", +sum);
    }
}