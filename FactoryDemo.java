package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport car = factory.createTransport("car");
        car.move();

        Transport plane = factory.createTransport("plane");
        plane.move();

        Transport train = factory.createTransport("train");
        train.move();
    }
}
