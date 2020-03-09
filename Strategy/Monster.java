import java.util.HashMap;

public abstract class Monster{

    private Integer maxHP;
    private Integer xp;
    private HashMap<String, Integer> items;
    private Integer hp;

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