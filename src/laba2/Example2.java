package laba2;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, в котором при делении на 5 в остатке 2, а при делении на 7, в остатке получается 1");
        int n = in.nextInt();
        if(n % 5 == 2 & n % 7 == 1) {
            System.out.println("Число подходит критериям");
        }
        else {
            System.out.println("Число не подходит критериям");
        }
    }
}
