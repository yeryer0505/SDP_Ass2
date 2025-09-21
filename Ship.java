package abstractfactory;

public class Ship implements Transport {
    @Override
    public void move() {
        System.out.println("Sailing a ship");
    }
}
