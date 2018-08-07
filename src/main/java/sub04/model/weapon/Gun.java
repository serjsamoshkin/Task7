package sub04.model.weapon;

import sub04.model.ammunition.Ammunition;

public class Gun implements Weaponry{

    public void shoot(Ammunition ammunition) {
        System.out.println("Выстелил: " + ammunition);
    }
}


