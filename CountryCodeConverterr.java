import java.util.Scanner;

public class CountryCodeConverterr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf): ");
        String countryCode = input.nextLine().toUpperCase();

        String countryName;

        if (countryCode.equals("ES")) {
            countryName = "Spain";
        } else if (countryCode.equals("TN")) {
            countryName = "TUNISIA";
        } else if (countryCode.equals("ID")) {
            countryName = "INDONESIA";
        } else if (countryCode.equals("MM")) {
            countryName = "Myanmar";
        } else if (countryCode.equals("IN")) {
            countryName = "INDIA";
        } else {
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
            return;
        }

        System.out.println("Kode negara: " + countryCode);
        System.out.println("Nama negara: " + countryName);
    }
}
