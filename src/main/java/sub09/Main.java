package sub09;

import sub09.model.MagazineGardener;
import sub09.model.Subscriber;

public class Main {

    public static void main(String[] args) {
        MagazineGardener magazineGardener = new MagazineGardener();
        magazineGardener.setSubscriber(new Subscriber(Subscriber.Location.VILLAGE, "Ивановка, ул. Центральная улица 10"));
        magazineGardener.setSubscriber(new Subscriber(Subscriber.Location.VILLAGE, "Малая стоянвка, ул. Крайняя 1"));
        magazineGardener.setSubscriber(new Subscriber(Subscriber.Location.TOWN, "Киев, ул. Крещатик 1"));

        magazineGardener.send(Subscriber.Location.VILLAGE);

    }

}
