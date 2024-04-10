import java.util.*;

public class ElectricPokemon extends Pokemon{

    public static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public float damage(Pokemon pokemon){
        float dmgMod;
        switch (pokemon.getType()) {
            case "water":
                dmgMod = 2f;
                break;
            case "grass":
                dmgMod = 1.2f;
                break;
            case "fire":
                dmgMod = 0.5f;
                break;
            default:
                dmgMod = 1f;
                break;
        }
        return dmgMod;
    }
    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder Punch");
        enemy.setHp(enemy.getHp() - (int) (20*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Electro Ball");
        enemy.setHp(enemy.getHp() - (int) (40*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Volt Tackle");
        enemy.setHp(enemy.getHp() - (int) (60*damage(enemy)));
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder Punch");
        enemy.setHp(enemy.getHp() - (int) (80*damage(enemy)));
        if(name.getType().equals("electric")){
            name.setHp(name.getHp()+20);
        }
        if (enemy.getType().equals("electric")){
            enemy.setHp(enemy.getHp()+20);
        }
        System.out.println(enemy.getName()+ "has " +enemy.getHp() + " HP left");
    }

}
