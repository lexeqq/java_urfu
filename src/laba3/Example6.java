package laba3;
import java.util.Scanner;
//Напишите программу, где создается одномерный числовой массив
//и заполняется числами, которые при делении на 5 дают в остатке 2
//(числа 2, 7,12,17 и так далее).
// Размер массива вводится пользователем.
//Предусмотреть обработку ошибки, связанной с вводом некорректного значения.
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int count = in.nextInt();
        int[] arr = new int[count];
        int a = 0;
        if(count == 0) {
            System.out.println("Некорректное значение");
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ((5 * a) + 2);
                a++;
                System.out.println(arr[i] + " ");
            }
        }
    }
}
