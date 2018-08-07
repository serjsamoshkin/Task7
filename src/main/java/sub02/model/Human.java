package sub02.model;

import sub02.model.state.HumanState;
import sub02.model.state.HunterState;

public class Human {
    HumanState state;

    public void setState(HumanState state) {
        this.state = state;
    }


    public void doAction(){
        state.doAction();
    }

    public void seeBeast(){
        state.seeBeast();
    }
    public void goToGlade(){
        state.goToGlade();
    }
    public void goToLake(){
        state.goToLake();
    }
}
