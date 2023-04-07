package less2homework;

public abstract class Node {
    private String name;
    private String surname;
    private int age;

    public void getParent(){}

    public void setParent(){}

    public void getChild(){}

    public void setChild(){}

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getNameData(){
        return " " + name + " " + surname;
    }
}