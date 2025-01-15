package laba4;
//Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
//Используете кодовую таблицу символов. При запуске программы в консоль необходимо вывести сообщение:
//«Введите текст для шифрования», после ввода текста, появляется сообщение:
//«Введите ключ». После того как введены все данные,
//необходимо вывести преобразованную строку с сообщением «Текст после преобразования: ».
//Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//если пользователь вводит «y», тогда выполнить обратное преобразование.
//Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
//Если пользователь вводит что-то другое, отличное от «y» или «n»,
//то программа ему выводит сообщение: «Введите корректный ответ».
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();

        String encryptedText = encrypt(text, key);
        System.out.println("Текст после шифрования: " + encryptedText);

        System.out.print("Выполнить дешифрование? (y/n): ");
        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")) {
            String decryptedText = decrypt(encryptedText, key);
            System.out.println("Исходный текст: " + decryptedText);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
    }

    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encryptedText.append((char) (((c - base + key) % 26) + base));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, -key);
    }
}
