package less1homework;

import java.util.ArrayList;

public class geoTree {
    private ArrayList<node> tree = new ArrayList<>();

    public ArrayList<node> getTree() {
        return tree;
    }

    public void appendPerentChild(person parent, person children) {
        tree.add(new node(parent, relationship.parent, children));
        tree.add(new node(children, relationship.children, parent));
    }

    public void appendWifeHusbant(person wife, person husbant) {
        tree.add(new node(wife, relationship.wife, husbant));
        tree.add(new node(husbant, relationship.husbant, wife));
    }
}