package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

public abstract class Monster{

    private Integer hp;
    private Integer xp;
    Integer agi = 5;
    Integer def = 5;
    Integer str = 5;
    Attack attack;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Integer getMaxHP() {
        return this.maxHP;
    }

    public void setMaxHP(Integer maxHP) {
        this.maxHP = maxHP;
    }

    public Integer getXp() {
        return this.xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    public HashMap<String,Integer> getItems()

    {
		return this.items;
	}

    public void setItems(HashMap<String,Integer>items)
    {
		this.items = items;
	}

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Attack getAttack() {
        return attack;
    }

    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max - min) + min;
    }

    


    
    Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }
    @Override
    public String toString(){
        return "hp=" + this.hp + "/" + maxHP;
    }
}