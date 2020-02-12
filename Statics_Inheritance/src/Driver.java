import java.util.ArrayList;
import java.util.List;

/**
 * @author Drew A. Clinkenbeard
 *
 * This is the main class that will drive the lab.
 */
public class Driver {
    public static void main(String[] args) {
        //We can access count without instantiating anything because it is static
        System.out.println("Current Stormtrooper count: " + Stormtrooper.getCount());

        /* This is something interesting. We are creating a type of List but
         * initializing it to a type of ArrayList.
         * This works because ArrayList implements List (and many other things)
         */
        List<Stormtrooper> stormtroopers = new ArrayList<>();
//      Try uncommenting the line below and see what happens. (remember ctrl+/ or cmd+/ will uncomment/comment things)
//        List<Stormtrooper> troopersList = new List<>();

        Stormtrooper fn2187 = new Stormtrooper();
        stormtroopers.add(fn2187);
        System.out.println("Current Stormtrooper count: " + Stormtrooper.getCount());
        for(int i = 0; i < 5; i++){
            stormtroopers.add(new Stormtrooper());
        }
        //What will COUNT be after this?
        System.out.println("Current Stormtrooper count: " + Stormtrooper.getCount());

        //does the count from Stormtrooper match the size of stormtroopers? (the arraylist)
        //how would you find out?

        List<Trooper> troopers = new ArrayList<>();

        //This is a foreach loop, in Java we call these 'enhanced for loops'
        for(Stormtrooper s : stormtroopers){
            troopers.add(s);
        }

        //Look at the class Stormtrooper. Notice that it implements trooper.
        //Make Flame Trooper implement Trooper as well, then uncomment the following code.

//        for(int i = 0; i < 10; i ++){
//            if(i%2 != 0){
//                troopers.add(new Flametrooper());
//            }else{
//                troopers.add(new Stormtrooper());
//            }
//        }

        for(Trooper t : troopers){
            System.out.println(t);
        }

//        Try moving line 8 from Stormtrooper to line 5 of trooper.
//        Once your done with that, add a constructor to Flametrooper to increment COUNT

//        Now look at the two test files. StormtrooperTest and FlametrooperTest
//        Uncomment all the tests and run them...

    }
}
