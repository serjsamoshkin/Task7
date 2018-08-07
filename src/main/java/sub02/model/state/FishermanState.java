package sub02.model.state;

import sub02.model.Human;
import sub02.model.state.HumanState;

public class FishermanState extends HumanState {

    public FishermanState(Human human) {
        super(human);
    }

    public void goToGlade() {
        System.out.println("Что-то сегодня не ключет, пойду хоть грибочков соберу.");
        changeState(new MushroomerState(human));

    }

    public void seeBeast() {
        System.out.println("Что-то сегодня не ключет, пойду поймаю этого зверя.");
        changeState(new HunterState(human));
    }

    public void goToLake() {
        System.out.println("Я уже и так ловлю рыбу");
    }

    public void doAction() {
        System.out.println("Ловись рыбка большая и маленькая.");
    }
}
