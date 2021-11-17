import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Feladatok {
    ArrayList<Hegycsucs> lista;

    public Feladatok() {
        Beolvas();
        System.out.println("3.feladat: Hegycsúcsok száma: "+lista.size());

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


}
