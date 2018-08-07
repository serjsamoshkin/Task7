package sub08.Model;

import sub08.Model.PizzaComposit;

public class Pizza extends PizzaComposit {

    public Pizza() {
        super();
    }

    @Override
    public void prepareComponent() {
        System.out.println("Пицца установлена в печь");
        System.out.println("Пицца готова");
    }
}
