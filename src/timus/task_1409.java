package timus;
import java.io.PrintWriter;
import java.util.Scanner;
public class task_1409 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int sumofcans = a + b - 1;

        int result1 = sumofcans - a;
        int result2 = sumofcans - b;

        out.println(result1 + " " + result2);
        out.flush();
    }
}
