import Driver.CategoryB;
import Driver.CategoryC;
import Driver.CategoryD;
import Driver.Driver;
import Transport.Bus;
import Transport.Freight;
import Transport.Passenger;

public class Main {
    public static void main(String[] args) {

        Passenger shkoda = new Passenger("Шкода", "Супер Б", 3.0, new double[]{1.55,1.32,1.67},137);
        Passenger audi = new Passenger("Ауди", "А6", 3.6,new double[]{1.44,1.4,1.51},145);
        Passenger bmw = new Passenger("БМВ", "М3", 3.4,new double[]{1.58,1.62,1.88},110);
        Passenger toyota = new Passenger("Тойота", "Суприм", 2.6,new double[]{1.32,1.27,1.49},103);

        Freight uaz = new Freight("УАЗ", "версия-1", 3.0,new double[]{1.45,1.42,1.47},128);
        Freight fiat = new Freight("Фиат", "хьюдж", 4.0,new double[]{1.55,1.52,1.57},130);
        Freight merce = new Freight("Мерседес", "форс", 4.2,new double[]{1.65,1.62,1.67},140);
        Freight lada = new Freight("Лада", "груз", 3.6,new double[]{1.65,1.38,1.63},127);

        Bus maz = new Bus("MAP", "М-21", 3.0,new double[]{1.49,1.32,1.68},133);
        Bus nefaz = new Bus("НефАЗ", "5299", 3.4,new double[]{1.87,1.68,1.71},135);
        Bus volzhanin = new Bus("Волжанин", "АК-1", 4.0,new double[]{1.53,1.34,1.68},145);
        Bus rusbus = new Bus("Русбус", "номер-7", 3.8,new double[]{1.55,1.49,1.69},155);

        Driver kuryan = new Driver<CategoryB>("Курьян Максим", new CategoryB(), 2);
        Driver imba = new Driver<CategoryC>("Иммунов Илья", new CategoryC(), 2);
        Driver arlok = new Driver<CategoryD>("Онегин Евгений", new CategoryD(), 2);

        shkoda.bestTimeOfLap();
        audi.pitStop();
        toyota.maxSpeed();
        System.out.println();

        uaz.bestTimeOfLap();
        fiat.pitStop();
        merce.maxSpeed();
        System.out.println();

        maz.bestTimeOfLap();
        volzhanin.pitStop();
        rusbus.maxSpeed();
        System.out.println();

        kuryan.startDriving(bmw);
        kuryan.startDriving(rusbus);
        imba.startDriving(lada);
        arlok.startDriving(volzhanin);
        kuryan.stopDriving(bmw);

    }
}