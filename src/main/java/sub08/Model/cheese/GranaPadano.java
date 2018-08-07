package sub08.Model.cheese;

import sub08.Model.PizzaComponent;
import sub08.Model.Rubbable;

public class GranaPadano implements Rubbable, PizzaComponent{

    @Override
    public void prepare() {
        rub();
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public void rub() {
        System.out.println("Сыр Грана-падон натерт");
    }
}
