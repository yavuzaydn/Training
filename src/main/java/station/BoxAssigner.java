package station;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

public class BoxAssigner implements BiConsumer<List<Box>, Set<Station>> {
    public static final BoxAssigner INSTANCE = new BoxAssigner();

    @Override
    public void accept(List<Box> boxes, Set<Station> stations) {
        Box next = boxes.get(0);
        Set<String> producibleStations = next.getProducibleStations();
        String stationId = stations.iterator().next().getId();
        producibleStations.contains(stationId);
        stations.iterator().next().getLoadedCapacity();
        stations.iterator().next().setLoadedCapacity(stations.iterator().next() + boxes.iterator().next().getLoad());
    }
}
