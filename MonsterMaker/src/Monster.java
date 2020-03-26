import java.util.HashMap;

public abstract class Monster {
    protected String name;
    protected String monsterKind;
    private static int monsterCount;

    Monster(){
        this("Trogdor");
    }

    Monster(String name){
        this.name = name;
        monsterCount += 1;
    }

    public abstract String eat(String thing);

    final public String foo() {
        return null;
    }

    public static void addMonster(HashMap<Integer, Monster> hash_map, Monster thing){
        hash_map.put(hash_map.size()+1, thing);
    }

    public String getName() {
        return name;
    }

    public void setMonsterKind(String monsterKind) {
        this.monsterKind = monsterKind;
    }

    public String getMonsterKind() {
        return monsterKind;
    }

    public static int getMonsterCount() {
        return monsterCount;
    }

    private static void addMonster(){
        monsterCount++;
    }
}
