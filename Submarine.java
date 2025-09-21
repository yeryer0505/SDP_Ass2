package abstractfactory;

public class Submarine implements Transport {
    @Override
    public void move() {
        System.out.println("Diving a submarine");
    }
}
