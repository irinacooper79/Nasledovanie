public class Train {
    package oop.pert3.transport;

    import ooo.part1.ValidationUtils;
    public class Train extends Transport{
        private float ticketPrice;
        private int rideTime;
        private String departureStation;
        private String arrivalStation;
        private int carriageNumber;
        public Train (String brand, String model, int manufacturingYear,
                       String manufactureCountry, String color, String fuelType,
                      int maxSpeed, float ticketPrice, int rideTime, String departureStation,
                      String arrivalStation, int carriageNumber) {
            Super (brand, model, manufacturingYear, manufactureCountry, color, maxSpeed, fuelType);
            setTicketPrice (ticketPrice);
            setRideTime(rideTime);
            setDepartureStation(departureStation);
            setArrivalStation(arrivalStation);
            setCarriageNumber (carriageNumber);

            public float getTucketPrice() { return ticketPrice;}
            public void setTicketPrice (float ticketPrice) {this.ticketPrice = Math.max (ticketPrice, 1.0f);}

            public int getRideTime() { return rideTime;}
            public void setRideTime (int rideTime) {this.rideTime = Math.max(rideTime, 1); }

            public String getDepartureStation() {return departureStation; }

            public void setDepartureStation (String departureStation) {
                this.departureStation = ValidationUtils.validOrDefault (departureStation, "default");

                public String getArrivalStation () {return arrivalStation;}
            }
        }
    }
}
