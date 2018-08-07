package sub05;

import sub05.Model.*;

public class Main {

    public static void main(String[] args) {

        Dish salad = new Cucumber(new Romanescu(new Tomato(new Salad())));

        if (salad.check()) {
            salad.prepare();
        }else {
            System.out.println("Выберете другие компоненты");
        }

        Dish salad2 = new Cucumber(new Tomato(new Salad()));
        if (salad2.check()) {
            salad2.prepare();
        }else {
            System.out.println("Выберете другие компоненты");
        }

    }

}
