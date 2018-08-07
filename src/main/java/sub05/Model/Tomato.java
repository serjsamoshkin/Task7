package sub05.Model;

public class Tomato extends SaladItem {

    public Tomato(Dish items) {
        super(items);
    }

    @Override
    public boolean checkItem() {
        return true;
    }

    @Override
    public void prepareItem() {
        System.out.println("Нарезаны помидоры");
    }
}
