package laba2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 5 до 10 включительно");
        int n = in.nextInt();
        if(n > 4 & n < 11) {
            System.out.println("Введенное число попадает в диапазон от 5 до 10");
        }
        else{
            System.out.println("Число не попадает в диапазон");
        }
    }
}
