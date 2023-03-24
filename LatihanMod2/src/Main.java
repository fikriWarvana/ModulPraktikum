import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        List<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan :" +Hewan);

        List<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus :" +deleteHewan);

        Hewan.removeAll(deleteHewan);
        System.out.println("Output Hewan :");
        for (String h : Hewan){
            System.out.println(h);
        }

    }
}