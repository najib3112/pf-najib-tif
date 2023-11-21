import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan huruf: ");
        char grade = input.next().charAt(0);

        double nilaiKonversi;

        switch (grade) {
            case 'A':
                nilaiKonversi = 4.0;
                break;
            case 'B':
                nilaiKonversi = 3.0;
                break;
            case 'C':
                nilaiKonversi = 2.0;
                break;
            case 'D':
                nilaiKonversi = 1.0;
                break;
            case 'E':
                nilaiKonversi = 0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                return;
        }

        System.out.println("Hasil konversi: " +nilaiKonversi);
    }
}
