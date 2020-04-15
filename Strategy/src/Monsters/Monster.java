package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    Integer agi = 5;
    Integer def = 5;
    Integer str = 5;
    Attack attack;
    private Integer maxHP = null;
    private HashMap<String,Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer attackTarget(Monster target){
        return this.attack.attack(target);
    }

    public Integer getHp() {
//        return 42;
        return hp;
    }

    public void healHp(Integer hp) {
        this.hp = (this.hp+hp > this.maxHP) ? this.maxHP : this.hp + hp;
    }

    public boolean takeDamage(Integer hp){
        this.hp -= hp;
        //return true if the Monster is still alive. i.e. HP > 0
        return this.hp > 0;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
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

    /**
     * This methods returns an integer value between min and max.
     * This is goofy. rand.nextInt(n) returns a number between 0-n
     * to get the value we want, a value between str - maxStr,
     * We need to get a random number from maxStr-str and
     * add str back in.
     * @param min an integer
     * @param max an integer
     * @return a random integer between min and max
     */
    Integer getAttribute(Integer min, Integer max){
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        //returns a random number between min and max inclusive
        return rand.nextInt(max-min) + min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) &&
                Objects.equals(getXp(), monster.getXp()) &&
                Objects.equals(getAgi(), monster.getAgi()) &&
                Objects.equals(getDef(), monster.getDef()) &&
                Objects.equals(getStr(), monster.getStr()) &&
                Objects.equals(getMaxHP(), monster.getMaxHP()) &&
                Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getAgi(), getDef(), getStr(), getMaxHP(), getItems());
    }

    @Override
    public String toString() {
        return  "hp=" + hp + "/" + maxHP;
    }
}
