public class Main {
    public static void main(String[] args) {
        int[] angka = {57, 63, 69, 71, 87};
        int jumlah = 0;

        // Menghitung jumlah dari angka-angka dalam array
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) jumlah / angka.length;

        // Menampilkan hasil perhitungan
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
