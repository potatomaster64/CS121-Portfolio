package weekTen;

public class Mage extends Character implements Fighter {
    private int magicPower;

    public Mage(String name, int health, int magicPower) {
        super(name, health);
        this.magicPower = magicPower;
    }

    @Override
    public void attack() {
        System.out.println(name + " casts a fireball! Magic Power: " + magicPower);
    }

    @Override
    public void defend() {
        System.out.println(name + " conjures a magical barrier.");
    }
}