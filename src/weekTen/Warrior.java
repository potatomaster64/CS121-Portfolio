package weekTen;

public class Warrior extends Character implements Fighter {
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void attack() {
        System.out.println(name + " slashes with a sword! Strength: " + strength);
    }

    @Override
    public void defend() {
        System.out.println(name + " raises a shield to block the attack.");
    }
}