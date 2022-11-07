package Driver;

import Transport.Bus;
import Driver.Driver;
import Transport.Car;
import Transport.Passenger;

public class CategoryD implements DriverLicence {
    @Override
    public boolean canDrive(Car car) {
        return car.getClass() == Bus.class;
    }
}
