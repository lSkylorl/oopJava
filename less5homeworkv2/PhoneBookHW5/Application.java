package PhoneBookHW5;

import java.util.Scanner;

public class Application {
    public static void start() {
        System.out.print("\033[H\\033[J");
        FoV fov = new ConsoleView();
        Controler controler = new Controler(fov, "D:/workers/oopjava/less5homeworkv2/PhoneBookHW5/phonebook.db");
        controler.LoadFromFile();

        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - Предыдущий\n2 - Следующий\n3 - Добавить контакт\n4 - удалить текущий контакт\n5 - Сохранить в базу данных");
                String key = input.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        controler.prev();
                        break;
                    case "2":
                        controler.next();
                        break;
                    case "3":
                        controler.add();
                        break;
                    case "4":
                        controler.remove();
                        break;
                    case "5":
                        controler.saveToFile();
                        break;
                    default:
                        System.out.println("Такой команды не сущестует");
                        break;
                }
            }
        }
    }
}