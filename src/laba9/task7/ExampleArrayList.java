package laba9.task7;
import java.util.ArrayList;
// ArrayList обеспечивает быстрый доступ по индексу, но удаление элементов требует сдвига оставшихся, что может замедлить работу
public class ExampleArrayList {
    public static void main(String[] args) {
        int N = 23; // Количество людей
        ArrayList<Integer> people = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size(); // Выбираем каждого второго
            people.remove(index); // Удаляем элемент
        }

        System.out.println("Оставшийся человек (ArrayList): " + people.get(0));
    }
}

