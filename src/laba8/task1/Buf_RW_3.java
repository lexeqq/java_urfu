package laba8.task1;

import java.io.*;

public class Buf_RW_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            // Создание файловых символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("D:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("D:\\MyFile2.txt"));

            int lineCount = 0; // Счетчик строк
            String s;

            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine(); // Переход на новую строку
            }

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            if (br != null) {
                br.close();
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}
