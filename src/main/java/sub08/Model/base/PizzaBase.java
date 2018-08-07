package sub08.Model.base;

import sub08.Model.PizzaComposit;

public class PizzaBase extends PizzaComposit {

    public PizzaBase() {
        super();
    }

    @Override
    public void prepareComponent() {
        System.out.println("Тесто раскатано");

    }
}
