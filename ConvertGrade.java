import java.util.Scanner;

public class ConvertGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan huruf: ");
        char grade = input.next().charAt(0);

        double convertedValue;

        switch (grade) {
            case 'A':
                convertedValue = 4.0;
                break;
            case 'B':
                convertedValue = 3.0;
                break;
            case 'C':
                convertedValue = 2.0;
                break;
            case 'D':
                convertedValue = 1.0;
                break;
            case 'E':
                convertedValue = 0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                return;
        }

        System.out.println("Hasil konversi: " + convertedValue);
    }
}
