package abstractfactory;

public class AirTransportFactory implements TransportFactory {
    @Override
    public Transport createFirstTransport() {
        return new Plane();
    }

    @Override
    public Transport createSecondTransport() {
        return new Helicopter();
    }
}
