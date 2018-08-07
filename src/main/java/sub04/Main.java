package sub04;

import sub04.model.airplane.Airplane;
import sub04.model.factory.RocketFactory;

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        airplane.setArmamentFactory(new RocketFactory());

        airplane.shoot();

        airplane.land();

        airplane.takeOff();
        airplane.takeOff();

        airplane.shoot();

        airplane.land();

        airplane.shoot();

    }
}
