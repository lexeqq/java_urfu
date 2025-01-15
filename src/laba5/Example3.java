package laba5;
// Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать
// объекты без передачи аргументов,
// с передачей одного аргумента
// и с передачей двух аргументов.
public class Example3 {

    public static class ClassExample3 {

        public int firstNumber; // Первое целочисленное поле

        public int secondNumber; // Второе целочисленное поле

        public ClassExample3() { // Конструктор без аргументов
            this.firstNumber = 0;
            this.secondNumber = 0;
        }

        public ClassExample3(int number) { // Конструктор с одним аргументом
            this.firstNumber = number;
            this.secondNumber = 0;
        }

        public ClassExample3(int firstNumber, int secondNumber) { // Конструктор с двумя аргументами
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
    }

    public static void main(String[] args) {
        ClassExample3 obj1 = new ClassExample3();
        System.out.println("obj1: firstNumber = " + obj1.firstNumber + ", secondNumber = " + obj1.secondNumber);

        ClassExample3 obj2 = new ClassExample3(9);
        System.out.println("obj2: firstNumber = " + obj2.firstNumber + ", secondNumber = " + obj2.secondNumber);

        ClassExample3 obj3 = new ClassExample3(1, 1);
        System.out.println("obj3: firstNumber = " + obj3.firstNumber + ", secondNumber = " + obj3.secondNumber);
    }
}