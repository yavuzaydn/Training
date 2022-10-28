package station;

public class Station {
    private String id;
    private long loadedCapacity;

    public String getId() {
        return id;
    }

    public long getLoadedCapacity() {
        return loadedCapacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLoadedCapacity(long loadedCapacity) {
        this.loadedCapacity = loadedCapacity;
    }
}
