package abstractfactory;

public class Helicopter implements Transport {
    @Override
    public void move() {
        System.out.println("Flying a helicopter");
    }
}
