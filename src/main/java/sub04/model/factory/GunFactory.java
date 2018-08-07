package sub04.model.factory;

import sub04.model.ammunition.Ammunition;
import sub04.model.ammunition.Bullet;
import sub04.model.weapon.Gun;
import sub04.model.weapon.Weaponry;

public class GunFactory implements ArmamentFactory {

    public Weaponry getWeapon() {
        return new Gun();
    }

    public Ammunition getAmmunition() {
        return new Bullet();
    }
}
