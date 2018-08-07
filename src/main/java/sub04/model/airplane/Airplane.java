package sub04.model.airplane;

import sub04.model.airplane.state.AirplaneState;
import sub04.model.airplane.state.LandedState;
import sub04.model.ammunition.Ammunition;
import sub04.model.factory.ArmamentFactory;
import sub04.model.weapon.Weaponry;

public class Airplane implements Fighter {
    private Ammunition ammunition;
    private Weaponry weapon;
    private AirplaneState state;

    public Airplane() {
        state = new LandedState(this);
    }

    public void setState(AirplaneState state) {
        this.state = state;
    }

    public void setArmamentFactory(ArmamentFactory factory) {
        ammunition = factory.getAmmunition();
        weapon = factory.getWeapon();
    }

    public void takeOff(){
        state.takeOff();
    }

    public void land(){
        state.land();
    }

    public void shoot() {
        if (weapon == null){
            System.out.println("Не установлено вооружение!");
            return;
        }
        if (ammunition == null){
            System.out.println("Нет боезапаса!");
            return;
        }

        state.shoot(weapon, ammunition);

    }
}
