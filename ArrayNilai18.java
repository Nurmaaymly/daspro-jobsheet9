import java.util.Scanner;
public class  ArrayNilai18 {
    public static void main (String[] args){
        int[] nilaiAkhir= new int[10];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt(); 
        }

        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                lulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                tidakLulus++;
            }
            
        }
        
        System.out.println("\nJumlah Mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus: " + tidakLulus);

        input.close();
    }
}