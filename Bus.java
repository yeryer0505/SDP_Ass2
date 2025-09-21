package abstractfactory;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Driving a bus");
    }
}
