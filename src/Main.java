import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileHandler users = new FileHandler("src/new_users_3.txt");
// users.search("там");
        // users.write("Это новая строка из кода");
        // users.writeFromTerminal();

        // копирование содержимого файла в другой файл
        boolean copied = users.copyToFile("src/new_file.txt");
        if (copied) {
            System.out.println("Содержимое успешно скопировано в другой файл.");
        } else {
            System.out.println("Ошибка при копировании файла.");
        }

        // Метод для записи списка строк в файл
        List<String> newLines = Arrays.asList("Новая строка 1", "Новая строка 2", "Новая строка 3");
        users.writeLines(newLines);

        // Метод для чтения определенного количества строк из файла, начиная с указанной строки
        int startLine = 2;
        int numLines = 3;
        List<String> lines = users.readLines(startLine, numLines);

        System.out.println("Прочитанные строки:");
        for (String line : lines) {
            System.out.println(line);
        }

        // Метод для удаления файла
        boolean deleted = users.deleteFile();
        if (deleted) {
            System.out.println("Файл успешно удален.");
        } else {
            System.out.println("Ошибка при удалении файла.");
        }
    }

    public static void task_1() {
        // System.out.println(Color.RED.getRGBCode());
        // System.out.println(Coin.NICKEL.getValue());
        // System.out.println(Month.JUNE.getDays());

        ArrayList<Coin> coins = new ArrayList<>();
        coins.add(Coin.PENNY);
        coins.add(Coin.NICKEL);
        coins.add(Coin.DIME);
        coins.add(Coin.QUARTER);

        // int result = 0;
        // for (Coin coin : coins) {
        //     result += coin.getValue();
        // }
        // System.out.println(result);

        int result = coins.stream().mapToInt(Coin::getValue).reduce(0, Integer::sum);
        System.out.println(result);
    }

    public static void task_2() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 4, 2, 5, 3, 4, 3, 4, 3, 4, 7));
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers);
    }
}

