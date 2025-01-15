package laba5;
// Напишите программу с классом, у которого есть два символьных поля и метод.
// Он возвращает результат, и у него нет аргументов.
// При вызове метод выводит в консольное окно все символы из кодовой таблицы,
// которые находятся «между» символами, являющимися значениями полей объекта
// (из которого вызывается метод).
// Например, если полям объекта присвоены значения ‘A’ и ‘D’,
// то при вызове метода в консольное окно должны выводиться все символы
// от ‘A’ до ‘D’ включительно.
public class Example2 {
    public static class ClassExample2 {

        public char startChar; // Первое символьное поле

        public char endChar; // Второе символьное поле

        public void printCharactersInRange() { // Метод, выводящий символы между startChar и endChar включительно
            char from = startChar < endChar ? startChar : endChar;
            char to = startChar > endChar ? startChar : endChar;

            for (char c = from; c <= to; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ClassExample2 classExample = new ClassExample2();
        classExample.startChar = 'A';
        classExample.endChar = 'D';
        classExample.printCharactersInRange();
    }
}