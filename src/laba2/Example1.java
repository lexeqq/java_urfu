package laba2;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое делится на 3 без остатка");
        int n = in.nextInt();
        int m = n;
        if(m % 3 == 0){
            System.out.println("Введенное число делится на 3");
        } else{
            System.out.println("Введенное число не делится на 3");
        }
    }
}


