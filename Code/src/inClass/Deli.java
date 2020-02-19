package inClass;

import java.util.ArrayList;
import java.util.HashMap;

public class Deli {
    public static void main(String[] args){
        HashMap<String,Integer> filling = new HashMap<>();
        filling.put("pepper jack", 2);
        filling.put("gouda",2);
        Sandwich grilledCheese = new DeliSandwich(2,filling);
        Burger doubleDouble = new Burger();
//        System.out.println(grilledCheese);

        ArrayList<Sandwich> menu = new ArrayList<>();
        menu.add(grilledCheese);
        menu.add(doubleDouble);

        for(Sandwich s : menu ){
            System.out.println(s.toString());
        }

    }
}
