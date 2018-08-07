package sub07.Model;

import java.time.LocalTime;

public class MechanicalWatch implements Clock {

    public void showTime() {
        System.out.println("" +
                " ___________\n" +
                "|     |     |\n" +
                "|     |_____|\n" +
                "|           |\n" +
                "|___________|");
    }
}
