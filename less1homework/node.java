package less1homework;

public class node {
    public node(person p1, relationship re, person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    person p1;
    relationship re;
    person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}