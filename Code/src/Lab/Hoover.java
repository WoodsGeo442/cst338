package Lab;

public class Hoover extends Vacuum{

    @Override
    public void activate() {
        if(on == true){
            System.out.println("this vacuum is already on");
        } else {
            System.out.println("turning this vacuum on");
            on = true;
        }
    }

    @Override
    public void deactivate() {
        if(on == false){
            System.out.println("this vacuum is already off");
        } else {
            System.out.println("turning this vacuum off");
            on = false;
        }

    }
}
