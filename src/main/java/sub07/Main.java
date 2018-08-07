package sub07;

import sub07.Model.Clock;
import sub07.Model.ClockFactory;
import sub07.Model.DigitalClockFactory;
import sub07.Model.MechanicalClockFactory;

public class Main {

    public static void main(String[] args) {
        ClockFactory factory = new MechanicalClockFactory();
        Clock clock = factory.createClock();
        clock.showTime();
    }

}
