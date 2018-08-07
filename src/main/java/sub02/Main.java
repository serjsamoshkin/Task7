package sub02;

import sub02.model.Human;
import sub02.model.state.HunterState;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();

        human.setState(new HunterState(human));
        human.doAction();
        human.seeBeast();
        human.goToGlade();
        human.seeBeast();
        human.goToLake();
        human.seeBeast();
        human.goToLake();
        human.goToGlade();

    }

}
