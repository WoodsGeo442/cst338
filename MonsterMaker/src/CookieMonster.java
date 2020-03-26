public class CookieMonster extends Monster {

    CookieMonster() {
        this("cookieM", "Blue Monster");
    }

    CookieMonster(String name, String kind) {
        this.name = name;
        this.monsterKind = kind;
    }

    public String sing(int mins) {
        if (mins % 2 == 1 && mins < 15) {
            return name + " sings C IS FOR COOKIE!! for " + mins + " minutes.";
        } else {
            return name + " says it is not time for singing.  Maybe in " + mins + " minutes.";
        }
    }

    public static String bake(Monster m) {

        if (m.getMonsterKind() == "Blue Guy") {
            return m.getName() + " bakes cookies in an oven.";
        } else {
            return m.getName() + " uses flame breath to bake a cake.";
        }
    }

    public String share(String name) {
        if (name == this.name) {
            return name + " does not share any cookies =-(";
        } else {
            return this.name + " shares cookies with " + name;
        }
    }

    public String eat(String food) {
        if (food == "cookie") {
            return "OM NOM NOM!";
        } else {
            return "C is for cookie, not " + food;
        }
    }

}
