package task22_2;

public class Car {
    private String model;
    private int year;

    public Car() {
        this("x5", 2007);
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
