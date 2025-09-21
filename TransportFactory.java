package abstractfactory;

public interface TransportFactory {
    Transport createFirstTransport();
    Transport createSecondTransport();
}
