import java.util.Scanner;
public class Tugas2Kafe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== DAFTAR MENU =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.println("========================");
        System.out.print("\nMau pesan berapa item? ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Pesanan ke-" + (i + 1) + ": ");
            String cari = sc.nextLine();

            boolean ketemu = false;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(cari)) {
                    pesanan[i] = menu[j];
                    hargaPesanan[i] = harga[j];
                    total = total + harga[j];
                    ketemu = true;
                    break;
                }
            }

            if (!ketemu) {
                System.out.println("Menu " + cari + " tidak tersedia, coba lagi");
                i--;
            }
        }

        System.out.println();
        System.out.println("===== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("--------------------------");
        System.out.println("Total biaya: Rp " + total);

        sc.close();
    }
}