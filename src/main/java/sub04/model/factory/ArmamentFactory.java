package sub04.model.factory;

import sub04.model.ammunition.Ammunition;
import sub04.model.weapon.Weaponry;

public interface ArmamentFactory {

    Weaponry getWeapon();
    Ammunition getAmmunition();

}
