package laba9.task6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем и заполняем HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Zumarev,Alexey,URFU"); // строка с запятыми
        map.put(1, "First");
        map.put(2, "Vtoroy");
        map.put(3, "3");
        map.put(4, "Tyumen");
        map.put(5, "Ekaterinburg");
        map.put(6, "RZHD");
        map.put(7, "noidea");
        map.put(8, "keyboard");
        map.put(9, "keycap");

        // Находим строки у которых ключ > 5
        System.out.println("Строки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        // Если ключ = 0, выводим строку через запятую
        if (map.containsKey(0)) {
            System.out.println("Строка при ключе 0:");
            System.out.println(map.get(0));
        }

        // Перемножаем все ключи, где длина строки > 5
        long product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        if (found) {
            System.out.println("Произведение ключей, где длина строки > 5: " + product);
        } else {
            System.out.println("Нет ключей с длиной строки > 5.");
        }
    }
}
