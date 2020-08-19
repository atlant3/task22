package task22_2;

public class Main implements CarAudi, CarBMW {
    public static void main(String[] args) {
        CarAudi ca =Car::new;
        CarBMW cb =Car::new;
        System.out.println(ca.create());
        System.out.println(cb.create("x5", 2007));


    }

    @Override
    public Car create() {
        return null;
    }

    @Override
    public Car create(String model, int year) {
        return null;
    }
}
