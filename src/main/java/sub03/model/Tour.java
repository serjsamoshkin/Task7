package sub03.model;

public class Tour {
    private Boolean transfer;
    private  Boolean flight;
    private Boolean hotelReservation;
    private Boolean insurance;

    private Tour(Boolean transfer, Boolean flight, Boolean hotelReservation, Boolean insurance) {
        this.transfer = transfer;
        this.flight = flight;
        this.hotelReservation = hotelReservation;
        this.insurance = insurance;
    }

    public static TourBuilder getBuilder(){
        return new TourBuilder();
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transfer=" + transfer +
                ", flight=" + flight +
                ", hotelReservation=" + hotelReservation +
                ", insurance=" + insurance +
                '}';
    }

    public static class TourBuilder {
        private Boolean transfer;
        private  Boolean flight;
        private Boolean hotelReservation;
        private Boolean insurance;

        public TourBuilder setTransfer(Boolean transfer) {
            this.transfer = transfer;
            return this;
        }

        public TourBuilder setFlight(Boolean flight) {
            this.flight = flight;
            return this;
        }

        public TourBuilder setHotelReservation(Boolean hotelReservation) {
            this.hotelReservation = hotelReservation;
            return this;
        }

        public TourBuilder setInsurance(Boolean insurance) {
            this.insurance = insurance;
            return this;
        }

        public Tour build(){
            return new Tour(transfer, flight, hotelReservation, insurance);
        }

    }


}

