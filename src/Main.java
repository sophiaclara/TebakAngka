import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random angka_random = new Random();

        System.out.println("Selamat datang di Permainan Tebak Angka!");
        System.out.println("Angka telah dipilih secara acak antara 1 hingga 100.");
        System.out.println("Anda memiliki waktu 1 menit untuk menebak angka tersebut.\n");
        System.out.println("Mulai tebak angka!");

        int angka = angka_random.nextInt(100) + 1;
        long start_time = System.currentTimeMillis();
        long elapsed_time = (System.currentTimeMillis() - start_time) / 1000;

        int tebakan;
        int percobaan = 0;
        boolean berhasil = false;

        while (true) {
            if (elapsed_time >= 60) {
                System.out.println("Waktu habis! Anda tidak berhasil menebak angka dalam 1 menit. Angka seharusnya " +angka);
                break;
            }

            percobaan++;
            System.out.print("Tebak angka (1-100): ");
            tebakan = scanner.nextInt();

            if (tebakan == angka) {
                berhasil = true;
                break;
            } else if (tebakan < angka) {
                System.out.println("Tebakan Anda terlalu rendah.\n");
            } else {
                System.out.println("Tebakan Anda terlalu tinggi.\n");
            }
        }

        if (berhasil) {
            System.out.println("Selamat, tebakan Anda benar!");
            System.out.println("Anda berhasil menebak angka " + angka + " dalam " + percobaan + " kali percobaan.");
            System.out.println("Terima kasih telah bermain. Sampai jumpa!");
        }

        scanner.close();
    }
}
