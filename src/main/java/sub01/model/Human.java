package sub01.model;

import sub01.model.state.FishermanState;
import sub01.model.state.HunterState;
import sub01.model.state.MushroomerState;
import sub01.model.state.HumanState;

public class Human {
    HumanState state;

    public void setState(HumanState state) {
        this.state = state;
    }

   public void doAction(){
       if (state == null) {
           throw new RuntimeException("Not set state!");
       }
       state.doAction();
   }
}
