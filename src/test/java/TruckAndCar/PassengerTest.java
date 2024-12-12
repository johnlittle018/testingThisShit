package TruckAndCar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    public void getWeight() {
        Passenger passenger = new Passenger(55);
        double weight = passenger.getWeight();
        Assertions.assertEquals(2000, weight);

    }
}