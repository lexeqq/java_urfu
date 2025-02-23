package laba7;

//Напишите программу, в которой есть суперкласс с приватным текстовым полем,
//конструктором с текстовым параметром и где переопределен метод toString ().
//На основе суперкласса путем наследования создается подкласс. У него появляется еще одно приватное текстовое поле.
//Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
//а еще в нем должен быть переопределен метод toString ().
//В обоих классах метод toString () переопределяется так, что он возвращает строку с
//названием класса и значение текстового поля или текстовых полей.

public class Example1 {
    public static void main(String[] args) {
        SuperClass1 obj1 = new SuperClass1("Привет");
        SubClass2 obj2 = new SubClass2("Привет", "Мир");
        SubClass2 obj3 = new SubClass2("Привет");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}

// Суперкласс с приватным текстовым полем
class SuperClass1 {
    private String text;

    // Конструктор с текстовым параметром
    public SuperClass1(String text) {
        this.text = text;
    }

    // Переопределенный метод toString()
    @Override
    public String toString() {
        return "SuperClass { text = '" + text + "' }";
    }
}

// Подкласс, наследующий SuperClass и добавляющий еще одно приватное текстовое поле
class SubClass2 extends SuperClass1 {
    private String extraText;

    // Конструктор с одним текстовым параметром
    public SubClass2(String text) {
        super(text);
        this.extraText = ""; // или можно задать значение по умолчанию
    }

    // Конструктор с двумя текстовыми параметрами
    public SubClass2(String text, String extraText) {
        super(text);
        this.extraText = extraText;
    }

    // Переопределенный метод toString(), который включает данные из суперкласса и своё поле
    @Override
    public String toString() {
        return "SubClass { " + super.toString() + ", extraText = '" + extraText + "' }";
    }
}
