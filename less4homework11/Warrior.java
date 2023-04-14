package less4homework11;

import java.util.Random;

public class Warrior<T extends Weapon> extends Person {

    protected T weapon;
    protected static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, Defense defend) {
        super(name, hp);
        this.weapon = weapon;
        this.defend = defend;
    }
    
    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " name = " + getName() +
                " hp = " + getHp() +
                " weapon " + weapon +
                " defend = " + defend + 
                "}";
    }
}
