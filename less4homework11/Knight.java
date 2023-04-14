package less4homework11;

public class Knight extends Warrior<Knife> {

    public Knight(String name, int hp, Knife weapon, BigShield bigShield) {
        super(name, hp, weapon, bigShield);
    }
    
    @Override
    public String toString() {
        return "Knight{" + 
                super.toString()+
                "}";
    }

    public int shotArmor() {
        return ((BigShield)getDefense()).getArmor();
    }
}
