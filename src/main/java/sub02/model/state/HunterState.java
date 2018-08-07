package sub02.model.state;

import sub02.model.Human;
import sub02.model.state.HumanState;

public class HunterState extends HumanState {
    public HunterState(Human human) {
        super(human);
    }

    public void goToGlade() {
        System.out.println("Куда вся дичь делать? Пойду хоть грибов соберу.");
        changeState(new MushroomerState(human));
    }

    public void seeBeast() {
        System.out.println("Ага, вот и мой ужин!");
    }

    public void goToLake() {
        System.out.println("Куда вся дичь делать? Пойду хоть рыбки наловлю.");
        changeState(new FishermanState(human));
    }

    public void doAction() {
        System.out.println("Я охочусь.");
    }
}
