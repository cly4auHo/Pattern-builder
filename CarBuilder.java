package builder_contr_product;

public class CarBuilder {

    String m = "Default";
    Transmission t = Transmission.MECHANICAL;
    int s = 100;

    CarBuilder buildMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder buildTransmission(Transmission t) {
        this.t = t;
        return this;
    }

    CarBuilder buildSpeed(int s) {
        this.s = s;
        return this;
    }

    Car build() {
        Car car = new Car();

        car.setMake(m);
        car.setMaxSpeed(s);
        car.setTransmission(t);
        return car;
    }
}
