package weekTen;

public abstract class Character {
    public static final int MAX_HEALTH = 100;
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = Math.min(health, MAX_HEALTH);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, MAX_HEALTH));
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attack();
}
