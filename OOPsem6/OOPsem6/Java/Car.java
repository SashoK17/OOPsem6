interface Engine {
    void start();
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}


// Теперь класс Car зависит от абстракции Engine, что позволяет ему использовать различные типы двигателей без изменения своей логики. Классы PetrolEngine и DieselEngine реализуют интерфейс Engine, обеспечивая необходимую функциональность для каждого типа двигателя.