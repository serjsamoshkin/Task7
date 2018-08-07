package sub05.Model;

public class Salad implements Dish{

    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void prepare() {
        System.out.println("Добавлено масло и соль, ингредиенты перемещаны. Приятного аппетита");
    }
}
