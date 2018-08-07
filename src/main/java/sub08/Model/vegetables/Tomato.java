package sub08.Model.vegetables;

import sub08.Model.Cuttable;
import sub08.Model.PizzaComponent;

public class Tomato implements Cuttable, PizzaComponent{

    @Override
    public void prepare() {
        cut();
    }

    @Override
    public int getPrice() {
        return 2;
    }

    @Override
    public void cut() {
        System.out.println("Помидор нарезан");
    }
}
