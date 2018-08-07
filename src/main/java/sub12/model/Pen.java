package sub12.model;

public class Pen implements Writable {

    private String color;
    private int diameter;
    Dot dot;

    public Pen(String color, int diameter) {
        this.color = color;
        this.diameter = diameter;
        dot = new Dot(color, diameter);
    }

    @Override
    public Dot getDot() {
        return dot;
    }
}
