package laba7;

//Напишите программу, в которой использована цепочка наследования из трех классов.
//В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
//В третьем классе появляется открытое целочисленное поле.
//В каждом из классов должен быть конструктор, позволяющий создавать объект на основе
//значений полей, переданных аргументами конструктору, а также конструктор создания копии.

public class Example4 {
    public static void main(String[] args) {

        // Создание объектов обычными конструкторами
        Task4First first = new Task4First('A');
        Task4Second second = new Task4Second('B', "Hello");
        Task4Third third = new Task4Third('C', "World", 123);

        // Вывод исходных объектов
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Создание копий объектов конструкторами копии
        Task4First firstCopy = new Task4First(first);
        Task4Second secondCopy = new Task4Second(second);
        Task4Third thirdCopy = new Task4Third(third);

        // Вывод копий
        System.out.println(firstCopy);
        System.out.println(secondCopy);
        System.out.println(thirdCopy);
    }
}

// Первый класс с открытым символьным полем
class Task4First {
    public char symbol;

    // Конструктор с параметром
    public Task4First(char symbol) {
        this.symbol = symbol;
    }

    // Конструктор копии
    public Task4First(Task4First other) {
        this.symbol = other.symbol;
    }

    @Override
    public String toString() {
        return "Task4First { symbol = " + symbol + " }";
    }
}

// Второй класс с открытым текстовым полем, наследуется от Task4First
class Task4Second extends Task4First {
    public String text;

    // Конструктор с двумя параметрами
    public Task4Second(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    // Конструктор копии
    public Task4Second(Task4Second other) {
        super(other);
        this.text = other.text;
    }

    @Override
    public String toString() {
        return "Task4Second { symbol = " + symbol + ", text = '" + text + "' }";
    }
}

// Третий класс с открытым целочисленным полем, наследуется от Task4Second
class Task4Third extends Task4Second {
    public int number;

    // Конструктор с тремя параметрами
    public Task4Third(char symbol, String text, int number) {
        super(symbol, text);
        this.number = number;
    }

    // Конструктор копии
    public Task4Third(Task4Third other) {
        super(other);
        this.number = other.number;
    }

    @Override
    public String toString() {
        return "Task4Third { symbol = " + symbol + ", text = '" + text + "', number = " + number + " }";
    }
}