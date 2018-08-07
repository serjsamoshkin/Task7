package sub07.Model;

public class MechanicalClockFactory implements ClockFactory {

    @Override
    public Clock createClock() {
        return new MechanicalWatch();
    }
}
