package inClass;

import java.util.HashMap;
import java.util.Map;

public class Burger extends DeliSandwich {
    Burger(){
        this("Beef Patty");
    }

    Burger(String filling){
        super(2, filling);
    }

    @Override
    public String toString(){
        return "bun + burger patty + bun";
    }
}
