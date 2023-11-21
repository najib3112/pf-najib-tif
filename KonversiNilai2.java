import java.util.Scanner;

public class KonversiNilai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan nilai huruf: ");
        char grade = input.next().charAt(0);

        double nilaiKonversi;

        if (grade == 'A') {
            nilaiKonversi = 4.0;
        } else if (grade == 'B') {
            nilaiKonversi = 3.0;
        } else if (grade == 'C') {
            nilaiKonversi = 2.0;
        } else if (grade == 'D') {
            nilaiKonversi = 1.0;
        } else if (grade == 'E') {
            nilaiKonversi = 0;
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
            return;
        }

        System.out.println("Hasil konversi: " + nilaiKonversi);
    }
}
