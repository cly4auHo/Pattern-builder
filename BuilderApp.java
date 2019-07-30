package builder_contr_product;

public class BuilderApp {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("AUDI")
                .buildSpeed(150)
                .buildTransmission(Transmission.AUTO)
                .build();
        System.out.println(car);
        
        Director dc = new Director();
        dc.setBuilder(new Subaru());
        Car car2 = dc.buildCar();
        System.out.println(car2);
    }
}
