import java.util.Scanner;

public class ConvertGradee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan nilai huruf: ");
        char grade = input.next().charAt(0);

        double convertedValue;

        if (grade == 'A') {
            convertedValue = 4.0;
        } else if (grade == 'B') {
            convertedValue = 3.0;
        } else if (grade == 'C') {
            convertedValue = 2.0;
        } else if (grade == 'D') {
            convertedValue = 1.0;
        } else if (grade == 'E') {
            convertedValue = 0;
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
            return;
        }

        System.out.println("Hasil konversi: " + convertedValue);
    }
}
