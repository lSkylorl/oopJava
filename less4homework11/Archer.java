package less4homework11;

public class Archer extends Warrior<Throwing> {

    public Archer(String name, int hp, Throwing weapon, SmallShield smallShield) {
        super(name, hp, weapon, smallShield);
    }

    public int getRange() {
        return rand.nextInt(weapon.getDistanse()+1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +
                "}";
    }
}
