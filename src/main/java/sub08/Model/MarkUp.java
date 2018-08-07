package sub08.Model;

public class MarkUp implements PizzaComponent {

    @Override
    public void prepare() {
        System.out.println("Устанговлена наценка");
    }

    @Override
    public int getPrice() {
        return 25;
    }
}
