import java.util.Scanner;
public class ArrayRataNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        if (jumlah <= 0) {
            System.out.println("Jumlah mahasiswa harus kebih dari 0!");
        } else {
            int[] nilaiMhs = new int[jumlah];
            int total = 0;
            double rata2;

            for (int i = 0; i < nilaiMhs.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilaiMhs[i] = sc.nextInt();
                total += nilaiMhs[i];
            }

            rata2 = (double) total / nilaiMhs.length;
            System.out.println("Total nilai: " + total);
            System.out.println("Rata-rata: " + rata2);

            int tertinggi = nilaiMhs[0];
            int terendah = nilaiMhs[0];
            
            for (int i = 1; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
                if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
            } 
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);

            int lulus = 0;
            for (int i = 0; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > 70) lulus++;
            }
            System.out.println("Jumlah mahasiswa yang lulus: " + lulus);

            String predikat;
            if (rata2 >= 85) {
                predikat = "SANGAT BAIK";
            } else if (rata2 >= 70) {
                predikat = "BAIK";
            } else {
                predikat = "PERLU PENDAMPINGAN";
            }
            System.out.println("Predikat kelas: " + predikat);
        }

        

        sc.close();
    }
}