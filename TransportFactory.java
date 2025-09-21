package factory;

public class TransportFactory {
    public Transport createTransport(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Transport type must not be null or empty");
        }
        return switch (type.toLowerCase()) {
            case "car" -> new Car();
            case "plane" -> new Plane();
            case "train" -> new Train();
            default -> throw new IllegalArgumentException("Unknown transport type: " + type);
        };
    }
}
