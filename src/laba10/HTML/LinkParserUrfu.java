package laba10.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class LinkParserUrfu {
    public static void main(String[] args) {
        try {
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect("https://urfu.ru/ru/about/supervisory/news/").get();

            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");

            // Выводим последние 10 новостей в консоль
            for (int i = 0; i < 20; i++) {
                if (i % 2 == 0) {
                    List<Node> nodes = newsParent.getFirst().childNodes();
                    Element element = (Element) nodes.get(i);
                    System.out.println("Тема: " +
                            element.getElementsByClass("blocktitle").getFirst().childNodes().getFirst());

                    System.out.println("Дата: " +
                            element.getElementsByClass("blockdate").getFirst().childNodes().getFirst() +
                            "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}