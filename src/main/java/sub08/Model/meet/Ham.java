package sub08.Model.meet;

import sub08.Model.Cuttable;
import sub08.Model.PizzaComponent;

public class Ham implements Cuttable, PizzaComponent{

    @Override
    public void prepare() {
        cut();
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public void cut() {
        System.out.println("Ветчина нарезана");
    }
}
