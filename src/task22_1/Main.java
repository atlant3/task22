package task22_1;

public class Main implements Pet {
    public static void main(String[] args) {
        Pet cow = () -> System.out.println("I cow");
        Pet cat = () -> System.out.println("I cat");
        Pet dog = () -> System.out.println("I dog");
        cow.voice();
        cat.voice();
        dog.voice();
    }
    @Override
    public void voice() {

    }
}

