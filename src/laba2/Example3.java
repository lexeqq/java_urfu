package laba2;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое не меньше 10 и делится на 4");
        int n = in.nextInt();
        if(n > 10 & n % 4 == 0) {
            System.out.println("Верно");
            }
        else{
            System.out.println("Не верно");
            }
        }
}

