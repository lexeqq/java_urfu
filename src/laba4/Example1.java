package laba4;
// Напишите программу, которая выводит в консольное окно прямоугольник,
// размеры сторон - ширина: 23 колонки, высота: 11 строк;
public class Example1 {
    public static void main(String[] args) {
        int figure = 11;  // Кол-во строк которое необходимо вывести
        int i;            // Число, необходимое для расчета количества строк
        int j;            // Число, необходимое для расчета количества колонок (символов в строке)
        int z;            // Переменная необходима для вывода служебного сообщения о количестве символов в строке;

        for (i = 1; i <= figure; i++) {
            System.out.print("Номер строки: " + i + " ");
            z = 0;
            for (j = -12; j < figure; j++) {
                System.out.print("+");
                z = z + 1;
            }
            System.out.println("Количество символов в строке " + z);
        }
    }
}