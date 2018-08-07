package sub08.Model.cheese;

import sub08.Model.Cuttable;
import sub08.Model.PizzaComponent;

public class Mozzarella implements Cuttable, PizzaComponent{

    @Override
    public void prepare() {
        cut();
    }

    @Override
    public int getPrice() {
        return 8;
    }

    @Override
    public void cut() {
        System.out.println("Сыр моцарелла нарезан");
    }
}
