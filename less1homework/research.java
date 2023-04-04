package less1homework;

import java.util.ArrayList;
import java.util.Scanner;

public class research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public research(geoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(person p, relationship re) {
        for (node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> searchAge() {
        System.out.print("Введите ограничение по возрасту(число): ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Люди, младше: " + age + ":");

        for (node t : tree) {

            if (t.p1.age <= age && !resultAge.contains(t.p1.fullName)) {
                resultAge.add(t.p1.fullName);
            }
        }
        return resultAge;
    }
}