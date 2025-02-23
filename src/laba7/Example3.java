package laba7;

//Напишите программу, в которой на основе суперкласса создается подкласс,
//а на основе этого подкласса создается еще один подкласс (цепочка наследования из трех классов).
//В первом суперклассе есть открытое целочисленное поле, метод с одним
//параметром для присваивания значения полю и конструктор с одним параметром.
//Во втором классе появляется открытое символьное поле, метод с двумя параметрами для
//присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//конструктор с тремя параметрами.
//Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса
//и значениями всех полей объекта.

public class Example3 {
    public static void main(String[] args) {
        // Создание объекта FirstClass с одним параметром
        FirstClass obj1 = new FirstClass(100);
        System.out.println(obj1);
        obj1.setValue(200);
        System.out.println("После setValue(int): " + obj1);

        // Создание объекта SecondClass с двумя параметрами
        SecondClass obj2 = new SecondClass(300, 'A');
        System.out.println(obj2);
        obj2.setValue(400, 'B');
        System.out.println("После setValue(int, char): " + obj2);

        // Создание объекта ThirdClass с тремя параметрами
        ThirdClass obj3 = new ThirdClass(500, 'C', "Hello");
        System.out.println(obj3);
        obj3.setValue(600, 'D', "World");
        System.out.println("После setValue(int, char, String): " + obj3);
    }
}

class FirstClass {
    // Открытое целочисленное поле
    public int intField;

    // Конструктор с одним параметром
    public FirstClass(int intField) {
        this.intField = intField;
    }

    // Метод с одним параметром для присваивания значения полю
    public void setValue(int value) {
        this.intField = value;
    }

    // Метод toString(), возвращающий название класса и значение поля
    @Override
    public String toString() {
        return "FirstClass { intField = " + intField + " }";
    }
}

class SecondClass extends FirstClass {
    // Открытое символьное поле
    public char charField;

    // Конструктор с двумя параметрами: целое число и символ
    public SecondClass(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    // Перегруженный метод setValue с двумя параметрами для присваивания значения полям
    public void setValue(int intValue, char charValue) {
        this.intField = intValue;
        this.charField = charValue;
    }

    // Метод toString(), возвращающий название класса и значения полей
    @Override
    public String toString() {
        return "SecondClass { intField = " + intField + ", charField = " + charField + " }";
    }
}

class ThirdClass extends SecondClass {
    // Открытое текстовое поле
    public String textField;

    // Конструктор с тремя параметрами: целое число, символ и строка
    public ThirdClass(int intField, char charField, String textField) {
        super(intField, charField);
        this.textField = textField;
    }

    // Перегруженный метод setValue с тремя параметрами для присваивания значений всем полям
    public void setValue(int intValue, char charValue, String textValue) {
        this.intField = intValue;
        this.charField = charValue;
        this.textField = textValue;
    }

    // Метод toString(), возвращающий название класса и значения всех полей объекта
    @Override
    public String toString() {
        return "ThirdClass { intField = " + intField + ", charField = " + charField
                + ", textField = '" + textField + "' }";
    }
}
