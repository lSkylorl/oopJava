package less4homework11;


public abstract class Person {
    private String name;
    public Defense defend;
    private int hp;

    public Person (String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void reduceHp(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    public Defense getDefense() {
        return defend;
    }
}
