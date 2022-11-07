package Transport;

public class Passenger extends Car implements Competing{

    public double[] timeOfLap;
    public int bestSpeed;

    public Passenger(String brand, String model, double engine,double[]timeOfLap,int bestSpeed) {
        super(brand, model, engine);
        this.timeOfLap = timeOfLap;
        if (bestSpeed <= 0) {
            this.bestSpeed = bestSpeed;
        } else {
            this.bestSpeed = bestSpeed;
        }
    }

    public double[] getTimeOfLap() {
            return timeOfLap;
    }

    public int getBestSpeed() {
            return bestSpeed;
        }

    @Override
    public void pitStop() {
        System.out.println("Отправиться на пит-стоп");
    }

    @Override
    public void bestTimeOfLap() {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < timeOfLap.length; i++) {
            if (timeOfLap[i] < min) {
                min = timeOfLap[i];
            }
        }
        System.out.println("Лучшее время круга составило: " + min);
    }

        @Override
        public void maxSpeed () {
            System.out.println("Максимальная скорость составила: " + bestSpeed);
        }
    }
