package sub04.model.weapon;

import sub04.model.ammunition.Ammunition;

public class RocketGun implements Weaponry{

    public void shoot(Ammunition ammunition) {
        System.out.println("Запущена: " + ammunition);
    }
}


