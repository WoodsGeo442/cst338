import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MonsterMaker {


    public static void main(String[] args){
        HashMap<Integer,Monster> monsters = new HashMap<>();
        List<String> food = new ArrayList<>();

        food.add("avocado");
        food.add("pizza");
        food.add("cake");
        food.add("burger");

        Random random = new Random();



        for(int i = 6; i > 0; i --){
            if (i%2 == 0){
                Monster.addMonster(monsters, new Dragon("Trogdor"+i,"Dragon"));
            } else {
                Monster.addMonster(monsters, new CookieMonster("HankMcCoy"+i,"Blue Guy"));
            }
        }

        for (Integer key : monsters.keySet() ){
            System.out.println("=-=-=-=-= Checking Static Methods =-=-=-=-=");
//            uncomment the appropriate test (i.e. if Dragon was implemented uncomment that line)
            System.out.println((CookieMonster.bake(monsters.get(key))));
            System.out.println(Dragon.burninate(monsters.get(key),12.5));
            if(monsters.get(key) instanceof CookieMonster){
                System.out.println("=-=-=-=-= Checking CookieMonster Methods =-=-=-=-=");
                System.out.println(monsters.get(key).eat("cookie"));
                System.out.println(monsters.get(key).eat(food.get(random.nextInt(food.size()))));
                System.out.println(((CookieMonster) monsters.get(key)).sing(10));
                System.out.println(((CookieMonster) monsters.get(key)).sing(7));
                System.out.println(((CookieMonster) monsters.get(key)).sing(41));
                System.out.println(((CookieMonster) monsters.get(key)).share(monsters.get(key).getName()) );
                System.out.println(((CookieMonster) monsters.get(key)).share("Trogdor") );

            } else if (monsters.get(key) instanceof Dragon){
                System.out.println("=-=-=-=-= Checking Dragons =-=-=-=-=");
                System.out.println(monsters.get(key).eat("peasant"));
                System.out.println(monsters.get(key).eat(food.get(random.nextInt(food.size()))));
                System.out.println(((Dragon) monsters.get(key)).flap(41));
                System.out.println(((Dragon) monsters.get(key)).flap(7));
                System.out.println(((Dragon) monsters.get(key)).flap(12));
                System.out.println(((Dragon) monsters.get(key)).trample("cottage"));
                System.out.println(((Dragon) monsters.get(key)).trample("wall"));
            }
            System.out.println("=-=-=-=-= Looping =-=-=-=-=");

        }

        System.out.println("the final count of Monsters: " + Monster.getMonsterCount());

    }

}
