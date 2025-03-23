package laba10.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = documentBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            // Добавление первой книги
            Element movie1 = doc.createElement("movie");
            rootElement.appendChild(movie1);

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Побег из Шоушенка"));
            movie1.appendChild(title1);

            Element author1 = doc.createElement("director");
            author1.appendChild(doc.createTextNode("Фрэнк Дарабонт"));
            movie1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1994"));
            movie1.appendChild(year1);

            // Добавление второй книги
            Element movie2 = doc.createElement("movie");
            rootElement.appendChild(movie2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Крестный отец"));
            movie2.appendChild(title2);

            Element author2 = doc.createElement("director");
            author2.appendChild(doc.createTextNode("Фрэнсис Форд Коппола"));
            movie2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1972"));
            movie2.appendChild(year2);

            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\Алексей\\IdeaProjects\\java_urfu\\src\\laba10\\XML\\ZumarevXML.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}