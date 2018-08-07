package sub02.model.state;

import sub02.model.Human;
import sub02.model.state.HumanState;

public class MushroomerState extends HumanState {

    public MushroomerState(Human human) {
        super(human);
    }

    public void goToGlade() {
        System.out.println("Раз грибочек, два грибочек, зачем идти на другую поляну?");
    }

    public void seeBeast() {
        System.out.println("Нож есть, можно и куропатку зажарить...");
        changeState(new HunterState(human));
    }

    public void goToLake() {
        System.out.println("Что-то нет грибов, пойду рыбку ловить.");
        changeState(new FishermanState(human));
    }

    public void doAction() {
        System.out.println("Собираю грибы.");
    }
}
