import java.util.Scanner;

public class TebakPin {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int pin = 3112;
    int kesempatan = 0;
    int maksimalKesempatan = 3;

    

    while (kesempatan < maksimalKesempatan) {
      kesempatan++;
      System.out.print("Masukkan PIN 4 digit: ");
      int tebak = input.nextInt();
      
      if (tebak == pin) {
        System.out.println("Selamat, PIN Anda benar!");
        break;
      } else {
        System.out.println("PIN Anda salah. Coba lagi.");
      }
      
    }

    if (kesempatan == maksimalKesempatan) {
      System.out.println("Anda telah mencapai batas percobaan.");
    }

  }

}