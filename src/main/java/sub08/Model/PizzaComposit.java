package sub08.Model;

import java.util.ArrayList;

public abstract class PizzaComposit implements PizzaComponent {

    private ArrayList<PizzaComponent> components;

    public PizzaComposit() {
        this.components = new ArrayList<>();
    }

    protected abstract void prepareComponent();

    public void addComponent(PizzaComponent component){
        components.add(component);
    }

    public void prepare() {
        components.forEach(PizzaComponent::prepare);
        prepareComponent();
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(PizzaComponent::getPrice).sum();
    }

}
