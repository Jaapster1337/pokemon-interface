import java.util.*;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";

    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public float damage(Pokemon pokemon){
        float dmgMod;
        switch (pokemon.getType()) {
            case "fire":
                dmgMod = 2f;
                break;
            case "electric":
                dmgMod = 1.2f;
                break;
            case "grass":
                dmgMod = 0.5f;
                break;
            default:
                dmgMod = 1f;
                break;
        }
        return dmgMod;
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf");
        enemy.setHp(enemy.getHp() - (int) (20*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Pump");
        enemy.setHp(enemy.getHp() - (int) (40*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Cannon");
        enemy.setHp(enemy.getHp() - (int) (60*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void rainDance(Pokemon name, Pokemon enemy){
        if(enemy.getType().equals("electric")){
            System.out.println("has no effect on"+ enemy.getName());
        }
        if(enemy.getType().equals("grass")){
            enemy.setHp(enemy.getHp()+20);
        }
    }
}
