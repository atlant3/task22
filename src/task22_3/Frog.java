package task22_3;

public class Frog implements Amphibia {

    Amphibia eating = () -> System.out.println("I eating");
    Amphibia sleeping = () -> System.out.println("I sleeping");
    Amphibia swimming = () -> System.out.println("I swimming");
    Amphibia walking = () -> System.out.println("I walking");

    @Override
    public void ido() {

    }
}
