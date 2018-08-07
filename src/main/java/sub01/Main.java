package sub01;

import sub01.model.Human;
import sub01.model.state.FishermanState;
import sub01.model.state.HunterState;
import sub01.model.state.MushroomerState;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new FishermanState());
        human.doAction();

        human.setState(new HunterState());
        human.doAction();

        human.setState(new MushroomerState());
        human.doAction();

    }

}
