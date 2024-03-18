public class SpeedCalculation {
    public double calculateAllowedSpeed(SpeedCalculator speedCalculator) {
        return speedCalculator.calculateAllowedSpeed();
    }
}

interface SpeedCalculator {
    double calculateAllowedSpeed();
}

class Car implements SpeedCalculator {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.8;
    }
}

class Bus implements SpeedCalculator {
    private int maxSpeed;

    public Bus(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.6;
    }
}
// Теперь класс SpeedCalculation использует интерфейс SpeedCalculator, что позволяет добавлять новые типы транспортных средств, не изменяя сам класс SpeedCalculation. Классы Car и Bus реализуют интерфейс SpeedCalculator и предоставляют специфичную логику расчета допустимой скорости для каждого типа транспортного средства. Это соответствует принципу открытости/закрытости.