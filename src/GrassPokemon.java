import java.util.*;
public class GrassPokemon extends Pokemon{

    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public float damage(Pokemon pokemon){
        float dmgMod;
        switch (pokemon.getType()) {
            case "electric":
                dmgMod = 2f;
                break;
            case "fire":
                dmgMod = 1.2f;
                break;
            case "water":
                dmgMod = 0.5f;
                break;
            default:
                dmgMod = 1f;
                break;
        }
        return dmgMod;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaf Storm");
        enemy.setHp(enemy.getHp() - (int) (20*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaf Blade");
        enemy.setHp(enemy.getHp() - (int) (40*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Solar Beam");
        enemy.setHp(enemy.getHp() - (int) (60*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leech Seed");
        enemy.setHp(enemy.getHp()-(int) (15*damage(enemy)));
        name.setHp(name.getHp() + (int) damage(name));
    }
}
