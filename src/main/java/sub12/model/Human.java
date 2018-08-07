package sub12.model;

public class Human {
    private Writable writable;
    private Paper paper;

    public void setWritable(Writable writable) {
        this.writable = writable;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void write(){

        paper.setDot(writable, 1, 1);
        paper.setDot(writable, 2, 2);
        paper.setDot(writable, 3, 3);

    }

    public void drawWithBrush(){

        if (writable instanceof Brush){
            Brush brush = (Brush)writable;

            brush.setPressingForce(1);
            paper.setDot(brush, 1, 1);

            brush.setPressingForce(2);
            paper.setDot(brush, 2, 2);

            brush.setPressingForce(3);
            paper.setDot(brush, 3, 3);

            brush.setPressingForce(4);
            paper.setDot(brush, 4, 4);

            brush.setPressingForce(5);
            paper.setDot(brush, 5, 5);
        }



    }

}
