package less2homework;

import java.util.ArrayList;
import java.util.List;

public class Person extends Node implements NodeInterface{

    private List<Person> children = new ArrayList<>();
    private List<Person> parents = new ArrayList<>();

    public Person(String name, String surname, int age, Person parent){
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        if (checkParent(parent))
        {
            this.parents.add(parent);
            parent.children.add(this);
        }

    }

    private boolean checkParent(Person person){
        return person != null;
    }

    @Override
    public List<Person> getParents() {
        return parents;
    }

    @Override
    public List<Person> getChildren() {
        return children;
    }

}