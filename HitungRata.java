public class HitungRata {
    public static void main(String[] args) {
        int[] data = {30, 40, 51, 50, 60};
        int total = 0;
        int n = data.length;

        for (int i = 0; i < n; i++) {
            total += data[i];
        }

        double rataRata = (double) total / n;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}