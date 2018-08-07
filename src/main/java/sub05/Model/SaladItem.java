package sub05.Model;

import java.util.ArrayList;

public abstract class SaladItem  implements Dish{
    Dish item;

    public SaladItem(Dish item) {
        this.item = item;
    }

    @Override
    public boolean check() {
        boolean isOk = checkItem();
        if (isOk)
            return item.check();
        else {
            return false;
        }
    }

    @Override
    public void prepare() {
        prepareItem();
        item.prepare();

    }

    protected abstract void prepareItem();
    protected abstract boolean checkItem();

}
