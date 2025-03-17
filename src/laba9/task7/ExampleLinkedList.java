package laba9.task7;
import java.util.LinkedList;
import java.util.ListIterator;
// В LinkedList удаление элементов выполняется быстрее, так как нет необходимости сдвигать оставшиеся элементы
public class ExampleLinkedList {
    public static void main(String[] args) {
        int N = 23;
        LinkedList<Integer> people = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            people.add(i);
        }

        ListIterator<Integer> iterator = people.listIterator();

        while (people.size() > 1) {
            if (!iterator.hasNext()) {
                iterator = people.listIterator(); // Возвращаемся в начало списка
            }
            iterator.next(); // Пропускаем одного
            if (!iterator.hasNext()) {
                iterator = people.listIterator(); // Проверяем на конец списка
            }
            iterator.next(); // Переходим ко второму
            iterator.remove(); // Удаляем его
        }

        System.out.println("Оставшийся человек (LinkedList): " + people.get(0));
    }
}

