package sub12;

import sub12.model.Brush;
import sub12.model.Human;
import sub12.model.Paper;
import sub12.model.Pen;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setPaper(new Paper());
        human.setWritable(new Pen("red", 1));

        human.write();

        Human human2 = new Human();
        human2.setPaper(new Paper());
        human2.setWritable(new Brush("red", 3));

        human2.drawWithBrush();
    }

}
