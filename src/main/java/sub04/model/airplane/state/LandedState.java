package sub04.model.airplane.state;

import sub04.model.airplane.Airplane;
import sub04.model.ammunition.Ammunition;
import sub04.model.weapon.Weaponry;

public class LandedState extends AirplaneState {

    public LandedState(Airplane airplane) {
        super(airplane);
    }

    public void takeOff() {
        AirplaneState nexState = new FlyingState(airplane);
        System.out.println("Взлетаем");
        airplane.setState(nexState);
    }

    public void land() {
        System.out.println("Но мы и так на земле...");
    }

    public void shoot(Weaponry weapon, Ammunition ammunition) {
        System.out.println("Стрельба невозможна, мы на земле!");
    }
}
