package less4homework11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import less1homework.person;

public class Team <T extends Person> implements Iterable<T> {
    List<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }

    public Team<T> addPersons(T person) {
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                "persons=" + persons +
                "}";
    }

    public int maxRange() {
        int max = 0;
        for (T person:this) {
            if (person instanceof Archer) {
                Archer archer = (Archer) person;
                if (archer.getRange() > max) {
                    max = archer.getRange();
                }
            }
        }
        return max;
    }

    public int minArmor() {
        int min = 0;
        for (T person:this) {
            if (person instanceof Knight) {
                if(((Knight)person).shotArmor() > min) min = ((Knight)person).shotArmor();
            }
        }
        return min;
    }
}
