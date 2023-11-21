import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Membuat HashMap untuk menyimpan nama orang dan ukuran pinggang mereka
        HashMap<String, Integer> ukuranPinggang = new HashMap<>();
        
        // Menambahkan data ukuran pinggang untuk setiap orang
        ukuranPinggang.put("Najib", 86);
        ukuranPinggang.put("Rendy", 95);
        ukuranPinggang.put("Edi", 89);
        ukuranPinggang.put("Abid", 71);
        ukuranPinggang.put("Riski", 68);

        // Menghitung jumlah dari ukuran pinggang
        int jumlah = 0;
        for (int pinggang : ukuranPinggang.values()) {
            jumlah += pinggang;
        }

        // Menghitung rata-rata
        double rataRata = (double) jumlah / ukuranPinggang.size();

        // Menampilkan hasil perhitungan
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
