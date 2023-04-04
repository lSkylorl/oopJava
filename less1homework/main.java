package less1homework;

public class main {
    public static void main(String[] args) {
        person Katia = new person("Екатерина", 58);
        person Maksim = new person("Максим", 62);
        person Mitia = new person("Митя", 29);
        person Dasha = new person("Даша", 23);
        person Jane = new person("Женя", 12);
        person Lesha = new person("Алексей", 9);
        person Sasha = new person("Александр", 9);
        person Viktor = new person("Виктор", 7);
        person Gena = new person("Геннадий", 10);
        person Dima = new person("Дима", 3);
        person Masha = new person("Маша", 9);
        geoTree gt = new geoTree();
        gt.appendPerentChild(Katia, Mitia);
        gt.appendPerentChild(Katia, Dasha);
        gt.appendPerentChild(Katia, Dima);
        gt.appendPerentChild(Mitia, Jane);
        gt.appendPerentChild(Mitia, Lesha);
        gt.appendWifeHusbant(Katia, Maksim);
        gt.appendPerentChild(Maksim, Mitia);
        gt.appendPerentChild(Maksim, Dasha);
        gt.appendPerentChild(Maksim, Sasha);
        gt.appendPerentChild(Maksim, Viktor);
        gt.appendPerentChild(Maksim, Gena);
        gt.appendPerentChild(Maksim, Masha);

        // Поиск детей Кати
        System.out.println("Дети Екатерины");
        System.out.println(new research(gt).spend(Katia, relationship.parent));
        // Поиск детей Максима
        System.out.println("Дети Максима");
        System.out.println(new research(gt).spend(Maksim, relationship.parent));

        // поиск мужа Кати
        System.out.println("Муж Екатерины");
        System.out.println(new research(gt).spend(Katia, relationship.wife));

        // Поиск людей по возрасту
        System.out.println(new research(gt).searchAge());
    }
}
