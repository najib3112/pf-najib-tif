import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf): ");
        String kodeNegara = input.nextLine().toUpperCase();

        String namaNegara;

        switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "TUNISIA";
                break;
            case "ID":
                namaNegara = "INDONESIA";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "INDIA";
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                return;
        }

        System.out.println("Kode negara: " + kodeNegara);
        System.out.println("Nama negara: " + namaNegara);
    }
}
