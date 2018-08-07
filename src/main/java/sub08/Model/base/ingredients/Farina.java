package sub08.Model.base.ingredients;

import sub08.Model.PizzaComponent;

public class Farina implements PizzaComponent {

    @Override
    public void prepare() {
        System.out.println("Мука добавлена");
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
