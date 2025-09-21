package abstractfactory;

public class LandTransportFactory implements TransportFactory {
    @Override
    public Transport createFirstTransport() {
        return new Car();
    }

    @Override
    public Transport createSecondTransport() {
        return new Bus();
    }
}
