package sub07.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class DigitalWatch implements Clock {

    public void showTime() {
        System.out.println(LocalTime.now());
    }
}
