package sub08;

import sub08.Model.MarkUp;
import sub08.Model.Pizza;
import sub08.Model.base.PizzaBase;
import sub08.Model.base.ingredients.Farina;
import sub08.Model.base.ingredients.Salt;
import sub08.Model.cheese.GranaPadano;
import sub08.Model.cheese.Mozzarella;
import sub08.Model.meet.Ham;
import sub08.Model.vegetables.Pepper;
import sub08.Model.vegetables.Tomato;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        PizzaBase base = new PizzaBase();
        base.addComponent(new Farina());
        base.addComponent(new Salt());
        pizza.addComponent(base);

        pizza.addComponent(new Ham());
        pizza.addComponent(new Mozzarella());
        pizza.addComponent(new GranaPadano());
        pizza.addComponent(new Tomato());
        pizza.addComponent(new Pepper());

        pizza.addComponent(new MarkUp());

        System.out.println("Pizza price: " + pizza.getPrice());

        pizza.prepare();
    }

}
