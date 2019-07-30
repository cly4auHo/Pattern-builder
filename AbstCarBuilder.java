package builder_contr_product;

public abstract class AbstCarBuilder {

    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }

}
