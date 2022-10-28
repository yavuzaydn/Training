package vehicle;

public class Citroen extends Vehicle {
    @Override
    int computeKmFor(int second, int gear) {
        return second * gear / 2;
    }
}
