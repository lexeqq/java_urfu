package laba5;
// Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
// Один из методов позволяет присвоить значение полю.
// Еще один метод при вызове возвращает результатом код символа.
// Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
public class Example1 {
    public static class ClassExample1 {

        private char character; // Закрытое символьное поле

        public void setCharacter(char character) { // Метод, присваивающий значение полю
            this.character = character;
        }

        public int getCharacterCode() { // Метод, возвращающий код символа
            return (int) character;
        }

        public void printCharacterAndCode() { // Метод, выводящий символ и его код в консоль
            System.out.println("Символ = " + character + ", Код = " + getCharacterCode());
        }
    }

    public static void main(String[] args) {
        ClassExample1 classExample = new ClassExample1();
        classExample.setCharacter('Z');
        classExample.printCharacterAndCode();
    }
}