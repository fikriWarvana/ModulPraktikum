import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Konsumsi>listKonsumsi= new ArrayList<>();
        Konsumsi<Makanan,Minuman>breakfast = new Konsumsi<>();
        Konsumsi<Makanan,Minuman>lunch = new Konsumsi<>();

        Makanan roti=new Makanan();
        roti.setNamaHidangan("Roti Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");
        breakfast.setKonsumsi(roti,susu);
        listKonsumsi.add (breakfast);

        Makanan nasi=new Makanan();
        nasi.setNamaHidangan("Nasi Putih");
        Minuman air= new Minuman ();
        air.setNamaHidangan("Air Putih");
        lunch.setKonsumsi(nasi,air);
        listKonsumsi.add(lunch);

        System.out.println("\tMENU KONSUMSI\t");
        for (Konsumsi<Makanan,Minuman> Konsumsi : listKonsumsi){
            Makanan makanan= Konsumsi.getM();
            Minuman minuman = Konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());

        }

    }

}