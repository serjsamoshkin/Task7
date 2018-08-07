package sub12.model;

public class Brush implements Writable {

    private String color;
    private int diameter;

    private int pressingForce;

    public int getPressingForce() {
        return pressingForce;
    }

    public void setPressingForce(int pressingForce) {
        this.pressingForce = pressingForce;
    }

    public Brush(String color, int diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    @Override
    public Dot getDot() {
        return new Dot(color, (pressingForce > diameter) ? diameter : pressingForce);
    }
}
