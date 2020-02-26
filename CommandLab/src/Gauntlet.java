import java.util.HashMap;

public class Gauntlet {
    public static void main(String[] args){
        Thanos thanos = new Thanos();
        HashMap<String, IStone> stones = new HashMap<>();
        PowerStone powerStone = new PowerStone();
        powerStone.special(thanos);
        SpaceStone spaceStone = SpaceStone.getInstance();
        SpaceStone spaceStone2 = SpaceStone.getInstance();

        System.out.println(thanos.getName() + " is at " + thanos.getLocation());
        spaceStone.setLocation("Knowwhere");
        System.out.println(spaceStone2.getLocation());

        stones.put("Space", spaceStone);
        stones.put("Power",powerStone );

        for(String stone : stones.keySet()){
            stones.get(stone).special(thanos);
        }
        System.out.println(thanos.getName() + " is at " + thanos.getLocation());
     }
}
