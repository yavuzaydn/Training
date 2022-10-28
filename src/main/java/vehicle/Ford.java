package vehicle;

public class Ford extends Vehicle {


    @Override
    int computeKmFor(int second, int gear) {
        return second / gear;
    }
}
