import java.util.Scanner;

public class CountryCodeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan kode negara (2 huruf): ");
        String countryCode = input.nextLine().toUpperCase();

        String countryName;

        switch (countryCode) {
            case "ES":
                countryName = "Spain";
                break;
            case "TN":
                countryName = "TUNISIA";
                break;
            case "ID":
                countryName = "INDONESIA";
                break;
            case "MM":
                countryName = "Myanmar";
                break;
            case "IN":
                countryName = "INDIA";
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                return;
        }

        System.out.println("Kode negara: " + countryCode);
        System.out.println("Nama negara: " + countryName);
    }
}
