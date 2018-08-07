package sub09.model;

import java.util.ArrayList;

public class MagazineGardener implements Magazine {

    ArrayList<Subscriber> subscribers;
    {
        subscribers = new ArrayList<>();
    }

    public ArrayList<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void send(Subscriber.Location location) {
        subscribers.stream().filter(s -> s.getLocation() == location).forEach(s -> s.receive(this));
    }

    @Override
    public String toString() {
        return "Журанл \"Садовод\"";
    }
}
