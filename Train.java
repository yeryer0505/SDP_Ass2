package factory;

public class Train implements Transport {
    @Override
    public void move() {
        System.out.println("Riding a train");
    }
}
