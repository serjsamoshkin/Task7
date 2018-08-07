package sub04.model.airplane.state;

import sub04.model.airplane.Airplane;
import sub04.model.ammunition.Ammunition;
import sub04.model.weapon.Weaponry;

public class FlyingState extends AirplaneState {



    public FlyingState(Airplane airplane) {
        super(airplane);
    }

    public void takeOff() {
        System.out.println("Мы уже летим, выгляни в иллюминатор!");
    }

    public void land() {
        AirplaneState nexState = new LandedState(airplane);
        System.out.println("Идем на посадку");
        airplane.setState(nexState);
    }

    public void shoot(Weaponry weapon, Ammunition ammunition) {
        weapon.shoot(ammunition);
    }
}
