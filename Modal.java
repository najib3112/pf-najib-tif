import java.util.Scanner;

public class Modal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan modal: ");
        double modal = input.nextDouble();

        System.out.print("Masukkan persen keuntungan: ");
        double persen = input.nextDouble();

        double profit = modal + (modal * persen / 100);

        System.out.println("Modal: " + modal);
        System.out.println("Persen Keuntungan: " + persen + "%");
        System.out.println("Profit: " + profit);

        input.close();
    }
}