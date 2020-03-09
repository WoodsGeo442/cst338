import java.util.HashMap;

public abstract class Monster{

    Integer maxHP;
    Integer xp;
    HashMap<String, Integer> items;
    
    Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        int hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
}