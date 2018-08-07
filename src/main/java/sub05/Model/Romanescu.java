package sub05.Model;

// Фрактальная капуста
public class Romanescu extends SaladItem {

    public Romanescu(SaladItem items) {
        super(items);
    }

    @Override
    public boolean checkItem() {
        System.out.println("Капусты \"Romanescu\" нет на складе");
        return false;
    }

    @Override
    public void prepareItem() {
        System.out.println("Нарезана капуста \"Romanescu\"");
    }
}
