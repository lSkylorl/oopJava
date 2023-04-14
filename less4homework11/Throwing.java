package less4homework11;

public abstract class Throwing implements Weapon {

    private int distance;

    public Throwing(int distanse) {
        this.distance = distanse;
    }
    
    public int getDistanse() {
        return distance;
    }

    @Override
    public String toString() {
        return "Throwing{" +
                "distance = " + distance + 
                "damage = " + damage() +
                "}";
    }
}
