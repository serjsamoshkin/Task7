package sub07.Model;

public class DigitalClockFactory implements ClockFactory {

    @Override
    public Clock createClock() {
        return new DigitalWatch();
    }
}
