package less3homework;

import java.util.List;

public class Program{
    public static void main(String[] args) {

        Person Katia = new Person("Екатерина", "Шишкина", 58, null);
        Person Maksim = new Person("Максим", "Шишкин", 62, null);
        Person Mitia = new Person("Митя", "Бочков", 29, Katia);
        Person Dasha = new Person("Даша", "Бочков", 23, Katia);
        Person Jane = new Person("Женя", "Бочков", 12, Dasha);
        Person Lesha = new Person("Алексей", "Шишкин", 9, Katia);
        Person Sasha = new Person("Александр", "Бочков", 9, Dasha);
        Person Viktor = new Person("Виктор", "Шишкин", 7, Katia);
        Person Gena = new Person("Геннадий", "Бочков", 10, Dasha);
        Person Dima = new Person("Дима", "Шишкин", 3, Katia);
        Person Masha = new Person("Маша", "Шишкина", 9, Katia);


        System.out.println("Родитель: ");
        for (Person person : Masha.getParents()) {
            System.out.println(person.getNameData());
        }

        System.out.println("Дети: ");
        for (Person person : Katia.getChildren()) {
            System.out.println(person.getNameData());
        }

        System.out.println();
        System.out.print("Родитель: ");
        for (Person person : Gena.getParents()) {
            System.out.println(person.getNameData());
        }

        System.out.println("Дети: ");
        for (Person person : Dasha.getChildren()) {
            System.out.println(person.getNameData());
        }
    }
}