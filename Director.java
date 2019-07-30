package builder_contr_product;

public class Director {

    AbstCarBuilder cb;

    void setBuilder(AbstCarBuilder c) {
        this.cb = c;
    }

    Car buildCar() {
        cb.createCar();
        
        cb.buildMake();
        cb.buildTransmission();
        cb.buildMaxSpeed();

        Car car = cb.getCar();
        return car;
    }
}
