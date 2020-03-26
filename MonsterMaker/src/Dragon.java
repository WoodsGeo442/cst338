public class Dragon extends Monster {

    Dragon(){
        this("Trogdor", "wingely");

    }

    Dragon(String name, String kind){
        this.name = name;
        this.monsterKind = kind;
    }

    public String flap(int wings){
        if(wings%2==0 || wings < 20){
            return name + " flaps its tiny wings " + wings + " times.";
        } else {
            return name + " can't even.";
        }
    }

    public static String burninate(Monster monsterName, Double number){
        if(monsterName.getMonsterKind() == "Dragon"){
            return monsterName.getName() + " burninates " + number + " peasants.";
        } else {
            return monsterName.getName() + " eats " + number + " cookies.";
        }
    }

    public String trample(String thing){
        if(thing.equals("cottage")){
            return "the " + thing + " is trampled by " + name;
        } else {
            return "the " + thing + " resists " + name;
        }
    }

    public String eat(String food){
        if(food == "peasant"){
            return "burna-licious";
        } else {
            return "Dragons don't eat " + food;
        }

    }
}
