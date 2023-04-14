package less4homework11;

import java.util.Random;

public class SmallShield extends Defend {
    public SmallShield(int pointOfDefend) {
        super(pointOfDefend);
    }  

    @Override
    public int defend(){
        return new Random().nextInt(10, pointOfDefend);
    }
    @Override
    public String toString() {
        return "Defend " + super.toString();
    }
}

