package abstractfactory;

public class WaterTransportFactory implements TransportFactory {
    @Override
    public Transport createFirstTransport() {
        return new Ship();
    }

    @Override
    public Transport createSecondTransport() {
        return new Submarine();
    }
}
