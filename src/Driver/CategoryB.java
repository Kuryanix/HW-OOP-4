package Driver;

import Transport.Car;
import Transport.Freight;
import Transport.Passenger;
import Driver.Driver;

public class CategoryB implements DriverLicence {

    @Override
    public boolean canDrive(Car car) {
        return car.getClass() == Passenger.class;
    }

}
