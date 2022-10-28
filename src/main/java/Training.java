import station.Box;
import station.BoxAssigner;
import station.Station;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Training {
    public static final Training INSTANCE = new Training();
   Station station1 = new Station();
   Station station2 = new Station();
   Box box1 = new Box();
    Box box2 = new Box();
    Box box3 = new Box();
    Box box4 = new Box();
    private double load;


    public void process() {
        BoxAssigner.INSTANCE.accept(new LinkedList<>(), new HashSet<>());
    }

    private void assignBoxes(List<Box> boxSequence, Set<Station> stations) {
        //sırasıyla bir boxı al
        //aldığın boxın üretilebilir istasyonlarını bul
        //bulduğun istasyonların içersinden en düşük loada sahip istasyonu seç
        //seçtiğin istasyona boxın loadunu ekle

            stations.add(station1);
            stations.add(station2);
            boxSequence.add(box1);
            boxSequence.add(box2);
            boxSequence.add(box3);
            boxSequence.add(box4);


        for(int i = boxSequence.size(); i>0; i++){

            if(station1.getLoadedCapacity() < station2.getLoadedCapacity()){
                station1.setLoadedCapacity(boxSequence.get(i).getLoad());
            }
                else if(station2.getLoadedCapacity() > station1.getLoadedCapacity()){
                    station2.setLoadedCapacity(boxSequence.get(i).getLoad());
                }


        }



    }
}
