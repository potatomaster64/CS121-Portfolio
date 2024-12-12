package weekTen;


public class Archer extends Character implements Fighter {
    private int agility;

    public Archer(String name, int health, int agility) {
        super(name, health);
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow! Agility: " + agility);
    }

    @Override
    public void defend() {
        System.out.println(name + " dodges the attack swiftly.");
    }
}