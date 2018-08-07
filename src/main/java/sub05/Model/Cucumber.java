package sub05.Model;

public class Cucumber extends SaladItem {

    public Cucumber(SaladItem items) {
        super(items);
    }

    @Override
    public boolean checkItem() {
        return true;
    }

    @Override
    public void prepareItem() {
        System.out.println("Нарезаны огурцы");
    }
}
