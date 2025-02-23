package laba7;

// Напишите программу, в которой есть суперкласс с приватным текстовым полем.
//В базовом классе (суперклассе) должен быть метод для присваивания значения полю с
//текстовым параметром. Объект суперкласса создается передачей одного текстового
//аргумента конструктору. Добавьте метод, который возвращает длину текстовой строки.
//На основе суперкласса создается подкласс. В подклассе появляется дополнительное
//открытое (публичное) целочисленное поле. В классе должны быть такие версии метода
//для присваивания значений полям (используется переопределение и перегрузка метода из
//суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
//текстовым и целочисленным параметром. У конструктора подкласса два параметра
//(целочисленный и текстовый).

public class Example2 {
    public static void main(String[] args) {
        // Создание объекта суперкласса с передачей текстового параметра
        SuperClass superObj = new SuperClass("Hello");
        System.out.println(superObj);
        System.out.println("Длина текста: " + superObj.getTextLength());

        // Создание объекта подкласса с двумя параметрами (целое число и текст)
        SubClass subObj = new SubClass(10, "World");
        System.out.println(subObj);
        System.out.println("Длина текста: " + subObj.getTextLength());

        // Демонстрация работы методов в подклассе:
        // 1. Метод без параметров – сбрасывает значения к значениям по умолчанию
        subObj.setValue();
        System.out.println("После setValue(): " + subObj);

        // 2. Метод с текстовым параметром – изменяет только текст
        subObj.setValue("NewText");
        System.out.println("После setValue(String): " + subObj);

        // 3. Метод с целочисленным параметром – изменяет только числовое поле
        subObj.setValue(50);
        System.out.println("После setValue(int): " + subObj);

        // 4. Метод с текстовым и целочисленным параметрами – изменяет оба поля
        subObj.setValue("Final", 99);
        System.out.println("После setValue(String, int): " + subObj);
    }
}

class SuperClass {
    private String text;

    // Конструктор с текстовым параметром
    public SuperClass(String text) {
        this.text = text;
    }

    // Метод для присваивания значения текстовому полю
    public void setValue(String text) {
        this.text = text;
    }

    // Метод, возвращающий длину строки
    public int getTextLength() {
        return (text != null) ? text.length() : 0;
    }

    // Защищённый метод для получения значения текстового поля (для использования в подклассе)
    protected String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "SuperClass { text = '" + text + "' }";
    }
}

class SubClass extends SuperClass {
    // Дополнительное публичное целочисленное поле
    public int intField;

    // Конструктор подкласса с двумя параметрами: целое число и текст
    public SubClass(int intField, String text) {
        super(text);
        this.intField = intField;
    }

    // Переопределённый метод setValue с текстовым параметром (то же, что и в суперклассе)
    @Override
    public void setValue(String text) {
        super.setValue(text);
    }

    // Перегруженный метод setValue без параметров: устанавливает значения по умолчанию
    public void setValue() {
        super.setValue("");
        intField = 0;
    }

    // Перегруженный метод setValue с целочисленным параметром: изменяет только числовое поле
    public void setValue(int intField) {
        this.intField = intField;
    }

    // Перегруженный метод setValue с текстовым и целочисленным параметрами: изменяет оба поля
    public void setValue(String text, int intField) {
        super.setValue(text);
        this.intField = intField;
    }

    @Override
    public String toString() {
        return "SubClass { text = '" + getText() + "', intField = " + intField + " }";
    }
}