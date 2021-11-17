public class Hegycsucs {

    private String nev;
    private String hegyseg;
    private int magassag;

    public Hegycsucs(String sor){
        String [] st= sor.split(";");
        this.nev= st[0];
        this.hegyseg= st[1];
        this.magassag= Integer.parseInt(st[2]);
    }

    public String getNev() {
        return nev;
    }

    public String getHegyseg() {
        return hegyseg;
    }

    public int getMagassag() {
        return magassag;
    }

    @Override
    public String toString() {
        return nev +
                " " + hegyseg +
                " " + magassag ;
    }

}
