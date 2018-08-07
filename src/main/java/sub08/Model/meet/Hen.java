package sub08.Model.meet;

import sub08.Model.Cuttable;
import sub08.Model.PizzaComponent;

public class Hen implements Cuttable, PizzaComponent{

    @Override
    public void prepare() {
        cut();
    }

    @Override
    public int getPrice() {
        return 12;
    }

    @Override
    public void cut() {
        System.out.println("Куриное филе нарезано");
    }
}
