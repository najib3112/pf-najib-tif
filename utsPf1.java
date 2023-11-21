import java.util.Scanner;

public class utsPf1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Masukkan 5 angka: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Bilangan genap: " + evenCount);
        System.out.println("Bilangan ganjil: " + oddCount);

        double average = (double) sum / numbers.length;
        System.out.println("Jumlah = " + sum);
        System.out.println("Rata-rata = " + average);
    }
}