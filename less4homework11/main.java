package less4homework11;

public class main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Rodin", 100, new Bow(20), new SmallShield(10)))
                .addPersons(new Archer("Bobin", 100, new Bow(15), new SmallShield(20)));
        knights.addPersons(new Knight("John", 150, new Knife(), new BigShield(30, 10)))
                .addPersons(new Knight("Adam", 150, new Knife(), new BigShield(30, 15)));
        Archer archer1 = new Archer("Rodin", 100, new Bow(20), new SmallShield(10)); 
        Archer archer2 = new Archer("Bobin", 100, new Bow(15), new SmallShield(20)); 
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}
