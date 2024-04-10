import java.util.*;

public class FirePokemon extends Pokemon{

    private static final String type = "fire";

    private static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public float damage(Pokemon pokemon){
        float dmgMod;
        switch (pokemon.getType()) {
            case "grass":
                dmgMod = 2f;
                break;
            case "water":
                dmgMod = 1.2f;
                break;
            case "electric":
                dmgMod = 0.5f;
                break;
            default:
                dmgMod = 1f;
                break;
        }
        return dmgMod;
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Fire Lash");
        enemy.setHp(enemy.getHp() - (int) (20*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Flamethrower");
        enemy.setHp(enemy.getHp() - (int) (40*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }


    void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Pyro Ball");
        enemy.setHp(enemy.getHp() - (int) (60*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Pyro Ball");
        enemy.setHp(enemy.getHp() - (int) (80*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }
}
