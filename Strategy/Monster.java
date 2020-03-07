import java.util.HashMap;

public abstract class Monster(){
    Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
    
        this.maxHP = maxHP;
        int hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
}