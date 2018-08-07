package sub04.model.airplane.state;

import sub04.model.airplane.Airplane;
import sub04.model.ammunition.Ammunition;
import sub04.model.weapon.Weaponry;

import java.util.ArrayList;
import java.util.Map;

public abstract class AirplaneState {
    Airplane airplane;

    public AirplaneState(Airplane airplane) {
        this.airplane = airplane;
    }

    public abstract void takeOff();
    public abstract void land();
    public abstract void shoot(Weaponry weapon, Ammunition ammunition);

}
