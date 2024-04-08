import java.util.List;

public abstract class Pokemon {
    private final String name;

    private final int level;

    private int hp;

    private final String food;

    private final String sound;

    private final List<String> attacks;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Pokemon(String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }
}
