package sub11.model;

public class Computer {
    Motherboard motherboard = new Motherboard();
    PowerSupply powerSupply = new PowerSupply();

    public void on(){
        powerSupply.powerOn();
        motherboard.checkComponents();

    }

    public void off(){
        powerSupply.powerOff();
    }

    public void restart(){
        powerSupply.powerOff();
        on();

    }

}
