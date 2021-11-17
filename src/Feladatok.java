import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Feladatok {
    ArrayList<Hegycsucs> lista;

    public Feladatok() {
        Beolvas();
        System.out.println("3.feladat: Hegycsúcsok száma: " + lista.size());
        Statisztika();
    }

    private void Beolvas() {
        lista= new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("hegyek.txt"));
            sc.nextLine();
            while(sc.hasNext()){
                lista.add(new Hegycsucs(sc.nextLine()));
            }
            for (Hegycsucs item: lista) {
                System.out.println(item);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Hiba");
        }
    }

    private void Statisztika() {
        HashMap<String, Integer> stat = new HashMap<>();
        for (Hegycsucs item: lista) {
            String kulcs = item.getHegyseg();
            stat.putIfAbsent(kulcs, 0);
            int ertek = stat.get(kulcs);
            stat.put(kulcs, ertek+1);
        }
        for (Map.Entry<String, Integer> entry: stat.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
