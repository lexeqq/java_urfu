package laba9.CollectionPerformance;

import java.util.*;

public class CollectionPerformanceTest {
    public static void main(String[] args) {
        final int SIZE = 9_000_000;
        measurePerformance(new ArrayList<>(), "ArrayList", SIZE);
        measurePerformance(new ArrayDeque<>(), "ArrayDeque", SIZE);
        measurePerformance(new TreeSet<>(), "TreeSet", SIZE);
    }

    private static void measurePerformance(Collection<Integer> collection, String name, int size) {
        System.out.println("Testing: " + name);

        long start, end;
        List<Integer> list = new ArrayList<>(collection);
        System.gc();

        // 1. Добавление в начало
        if (collection instanceof List) {
            start = System.currentTimeMillis();
            for (int i = 0; i < size; i++) {
                list.add(0, i);
            }
            end = System.currentTimeMillis();
            System.out.println("Add first: " + (end - start) + " ms");
        }
        System.gc();

        // 2. Добавление в конец
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Add last: " + (end - start) + " ms");
        System.gc();

        // 3. Добавление в середину
        if (collection instanceof List) {
            start = System.currentTimeMillis();
            for (int i = 0; i < size / 2; i++) {
                list.add(list.size() / 2, i);
            }
            end = System.currentTimeMillis();
            System.out.println("Add middle: " + (end - start) + " ms");
        }
        System.gc();

        // 4. Удаление из начала
        if (collection instanceof Deque) {
            start = System.currentTimeMillis();
            for (int i = 0; i < size / 2; i++) {
                ((Deque<Integer>) collection).removeFirst();
            }
            end = System.currentTimeMillis();
            System.out.println("Remove first: " + (end - start) + " ms");
        }
        System.gc();

        // 5. Удаление с конца
        if (collection instanceof Deque) {
            start = System.currentTimeMillis();
            for (int i = 0; i < size / 2; i++) {
                ((Deque<Integer>) collection).removeLast();
            }
            end = System.currentTimeMillis();
            System.out.println("Remove last: " + (end - start) + " ms");
        }
        System.gc();

        // 6. Удаление из середины
        if (collection instanceof List) {
            start = System.currentTimeMillis();
            for (int i = 0; i < size / 4; i++) {
                list.remove(list.size() / 2);
            }
            end = System.currentTimeMillis();
            System.out.println("Remove middle: " + (end - start) + " ms");
        }
        System.gc();

        // 7. Получение элемента по индексу
        if (collection instanceof List) {
            start = System.currentTimeMillis();
            for (int i = 0; i < size / 2; i++) {
                list.get(list.size() / 2);
            }
            end = System.currentTimeMillis();
            System.out.println("Get by index: " + (end - start) + " ms");
        }
        System.gc();
        System.out.println();
    }
}


