package sub08.Model.base.ingredients;

import sub08.Model.PizzaComponent;

public class Salt implements PizzaComponent {

    @Override
    public void prepare() {
        System.out.println("Соль добавлена");
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
