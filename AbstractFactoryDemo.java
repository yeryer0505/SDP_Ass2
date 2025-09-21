package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        TransportFactory factory;

        String type = "water"; // "air" "land" "water"

        switch (type.toLowerCase()) {
            case "land" -> factory = new LandTransportFactory();
            case "air" -> factory = new AirTransportFactory();
            case "water" -> factory = new WaterTransportFactory();
            default -> throw new IllegalArgumentException("Unknown transport family: " + type);
        }

        Transport first = factory.createFirstTransport();
        Transport second = factory.createSecondTransport();

        first.move();
        second.move();
    }
}
