package laba10.XML;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLParser {
    private static final String FILE_PATH = "C:\\Users\\Алексей\\IdeaProjects\\java_urfu\\src\\laba10\\XML\\ZumarevXML.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            File inputFile = new File(FILE_PATH);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbuilder = dbFactory.newDocumentBuilder();
            Document doc = dbuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Просмотреть все фильмы");
                System.out.println("2. Добавить новый фильм");
                System.out.println("3. Поиск фильма по режиссеру");
                System.out.println("4. Поиск фильма по году выпуска");
                System.out.println("5. Удалить фильм");
                System.out.println("6. Выйти");
                System.out.print("Ваш выбор: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера

                switch (choice) {
                    case 1:
                        printAllMovies(doc);
                        break;
                    case 2:
                        addNewMovie(doc, scanner);
                        break;
                    case 3:
                        searchByDirector(doc, scanner);
                        break;
                    case 4:
                        searchByYear(doc, scanner);
                        break;
                    case 5:
                        deleteMovie(doc, scanner);
                        break;
                    case 6:
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

    // Метод для вывода всех фильмов
    private static void printAllMovies(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("movie");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("\nФильм " + (i + 1) + ":");
                System.out.println("Название: " + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Режиссер: " + element.getElementsByTagName("director").item(0).getTextContent());
                System.out.println("Год выпуска: " + element.getElementsByTagName("year").item(0).getTextContent());
            }
        }
    }

    // Метод для добавления нового фильма
    private static void addNewMovie(Document doc, Scanner scanner) {
        try {
            System.out.print("Введите название фильма: ");
            String title = scanner.nextLine();
            System.out.print("Введите режиссера фильма: ");
            String director = scanner.nextLine();
            System.out.print("Введите год выпуска: ");
            String year = scanner.nextLine();

            Element newMovie = doc.createElement("movie");

            Element newTitle = doc.createElement("title");
            newTitle.appendChild(doc.createTextNode(title));
            newMovie.appendChild(newTitle);

            Element newDirector = doc.createElement("director");
            newDirector.appendChild(doc.createTextNode(director));
            newMovie.appendChild(newDirector);

            Element newYear = doc.createElement("year");
            newYear.appendChild(doc.createTextNode(year));
            newMovie.appendChild(newYear);

            doc.getDocumentElement().appendChild(newMovie);

            saveChanges(doc);
            System.out.println("Фильм успешно добавлен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для поиска фильмов по режиссеру
    private static void searchByDirector(Document doc, Scanner scanner) {
        System.out.print("Введите режиссера для поиска: ");
        String director = scanner.nextLine();
        NodeList nodeList = doc.getElementsByTagName("movie");
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String movieDirector = element.getElementsByTagName("director").item(0).getTextContent();
                if (movieDirector.equalsIgnoreCase(director)) {
                    System.out.println("\nНайден фильм:");
                    System.out.println("Название: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Год выпуска: " + element.getElementsByTagName("year").item(0).getTextContent());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Фильмы данного режиссера не найдены.");
        }
    }

    // Метод для поиска фильмов по году выпуска
    private static void searchByYear(Document doc, Scanner scanner) {
        System.out.print("Введите год выпуска для поиска: ");
        String year = scanner.nextLine();
        NodeList nodeList = doc.getElementsByTagName("movie");
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String movieYear = element.getElementsByTagName("year").item(0).getTextContent();
                if (movieYear.equals(year)) {
                    System.out.println("\nНайден фильм:");
                    System.out.println("Название: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Режиссер: " + element.getElementsByTagName("director").item(0).getTextContent());
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Фильмы за данный год не найдены.");
        }
    }

    // Метод для удаления фильма
    private static void deleteMovie(Document doc, Scanner scanner) {
        System.out.print("Введите название фильма для удаления: ");
        String title = scanner.nextLine();
        NodeList nodeList = doc.getElementsByTagName("movie");
        boolean found = false;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String movieTitle = element.getElementsByTagName("title").item(0).getTextContent();
                if (movieTitle.equalsIgnoreCase(title)) {
                    doc.getDocumentElement().removeChild(node);
                    saveChanges(doc);
                    System.out.println("Фильм успешно удален.");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Фильм с таким названием не найден.");
        }
    }

    // Метод для сохранения изменений в XML-файл
    private static void saveChanges(Document doc) {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(FILE_PATH));
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}