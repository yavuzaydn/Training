package station;

import java.util.HashSet;
import java.util.Set;

public class Box {


    private long load;
    private Set<String> producibleStations = new HashSet<>();

    public long getLoad() {
        return load;
    }

    public Set<String> getProducibleStations() {
        return producibleStations;
    }

    public void setLoad(long load) {
        this.load = load;
    }

    public void setProducibleStations(Set<String> producibleStations) {
        this.producibleStations = producibleStations;
    }
}
