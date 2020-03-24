import java.util.HashMap;

public abstract class Monster {
    protected String name;
    protected String monsterKind;
    private static int monsterCount;
    Boolean test;

    final public String foo()

    public String getName() {
        return name;
    }

    public static void addMonster(HashMap<Integer, Monster>, Monster){

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
}
