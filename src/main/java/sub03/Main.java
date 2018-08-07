package sub03;

import sub03.model.Tour;

public class Main {

    public static void main(String[] args) {
        Tour tour = Tour.getBuilder().setFlight(true).setHotelReservation(true).setInsurance(false).setTransfer(true).build();

        System.out.println(tour);
    }

}
