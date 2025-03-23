package laba10.JSON;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("C:\\Users\\Алексей\\IdeaProjects\\java_urfu\\src\\laba10\\JSON\\example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Просмотреть все книги");
                System.out.println("2. Добавить новую книгу");
                System.out.println("3. Поиск книги по автору");
                System.out.println("4. Удалить книгу по названию");
                System.out.println("5. Выйти");
                System.out.print("Ваш выбор: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                switch (choice) {
                    case 1:
                        printAllBooks(jsonArray);
                        break;
                    case 2:
                        addNewBook(jsonArray, scanner);
                        saveChanges(jsonObject);
                        break;
                    case 3:
                        searchByAuthor(jsonArray, scanner);
                        break;
                    case 4:
                        deleteBook(jsonArray, scanner);
                        saveChanges(jsonObject);
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    // Метод для вывода всех книг
    private static void printAllBooks(JSONArray jsonArray) {
        for (Object o : jsonArray) {
            JSONObject book = (JSONObject) o;
            System.out.println("\nКнига:");
            System.out.println("Название: " + book.get("title"));
            System.out.println("Автор: " + book.get("author"));
            System.out.println("Год издания: " + book.get("year"));
        }
    }

    // Метод для добавления новой книги
    private static void addNewBook(JSONArray jsonArray, Scanner scanner) {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();
        System.out.print("Введите год издания: ");
        String year = scanner.nextLine();

        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);

        jsonArray.add(newBook);
        System.out.println("Книга успешно добавлена.");
    }

    // Метод для поиска книг по автору
    private static void searchByAuthor(JSONArray jsonArray, Scanner scanner) {
        System.out.print("Введите автора для поиска: ");
        String author = scanner.nextLine();
        boolean found = false;

        for (Object o : jsonArray) {
            JSONObject book = (JSONObject) o;
            if (book.get("author").equals(author)) {
                System.out.println("\nНайдена книга:");
                System.out.println("Название: " + book.get("title"));
                System.out.println("Год издания: " + book.get("year"));
                found = true;
            }
        }

        if (!found) {
            System.out.println("Книги данного автора не найдены.");
        }
    }

    // Метод для удаления книги по названию
    private static void deleteBook(JSONArray jsonArray, Scanner scanner) {
        System.out.print("Введите название книги для удаления: ");
        String title = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject book = (JSONObject) jsonArray.get(i);
            if (book.get("title").equals(title)) {
                jsonArray.remove(i);
                System.out.println("Книга успешно удалена.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Книга с таким названием не найдена.");
        }
    }

    // Метод для сохранения изменений в JSON-файл
    private static void saveChanges(JSONObject jsonObject) {
        try (FileWriter file = new FileWriter("C:\\Users\\Алексей\\IdeaProjects\\java_urfu\\src\\laba10\\JSON\\example-json.json")) {
            file.write(jsonObject.toJSONString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
