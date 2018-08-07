package sub02.model.state;

import sub02.model.Human;

public abstract class HumanState {
    public Human human;

    public HumanState(Human human) {
        this.human = human;
    }

    public abstract void goToGlade();
    public abstract void seeBeast();
    public abstract void goToLake();

    public abstract void doAction();

    public void changeState(HumanState newState){
        human.setState(newState);
        newState.doAction();
    }

}
