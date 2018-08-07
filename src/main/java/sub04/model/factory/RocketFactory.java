package sub04.model.factory;

import sub04.model.ammunition.Ammunition;
import sub04.model.ammunition.Rocket;
import sub04.model.weapon.RocketGun;
import sub04.model.weapon.Weaponry;

public class RocketFactory implements ArmamentFactory {

    public Weaponry getWeapon() {
        return new RocketGun();
    }

    public Ammunition getAmmunition() {
        return new Rocket();
    }
}
