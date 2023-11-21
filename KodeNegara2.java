import java.util.Scanner;

public class KodeNegara2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf): ");
        String kodeNegara = input.nextLine().toUpperCase();

        String namaNegara;

        if (kodeNegara.equals("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals("TN")) {
            namaNegara = "TUNISIA";
        } else if (kodeNegara.equals("ID")) {
            namaNegara = "INDONESIA";
        } else if (kodeNegara.equals("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals("IN")) {
            namaNegara = "INDIA";
        } else {
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
            return;
        }

        System.out.println("Kode negara: " + kodeNegara);
        System.out.println("Nama negara: " + namaNegara);
    }
}
