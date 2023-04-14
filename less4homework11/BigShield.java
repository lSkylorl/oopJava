package less4homework11;

import java.net.PortUnreachableException;
import java.util.Random;

public class BigShield extends Defend {
    
    public int armor;

    public int getArmor() {
        return armor;
    }

    public BigShield(int pointOfDefend, int armor) {
        super(pointOfDefend);
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "SmallShield{" +
                "armor = " + armor + 
                "Defend = " + pointOfDefend +
                "}";
    }

    @Override
    public int defend() {
        return  new Random().nextInt(20, pointOfDefend);
    }
}