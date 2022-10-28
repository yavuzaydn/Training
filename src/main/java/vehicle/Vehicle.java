package vehicle;

public abstract class Vehicle {
    abstract int computeKmFor(int second, int gear);

    private int km;

    public void move(int second, int gear) {
        km += computeKmFor(second, gear);
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
