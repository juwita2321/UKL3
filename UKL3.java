import java.util.Scanner;
public class UKL3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Rata-rata Nilai\n2. Penjumlahan Matriks");
        System.out.print("Pilih: ");
        int p = in.nextInt();

        if (p == 1) {
            System.out.print("Jumlah siswa: ");
            int n = in.nextInt();
            double t = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Nilai ke-" + i + ": ");
                t += in.nextDouble();
            }
            System.out.println("Rata-rata: " + (t / n));
        } else if (p == 2) {
            System.out.print("Baris: ");
            int b = in.nextInt();
            System.out.print("Kolom: ");
            int k = in.nextInt();
            int[][] A = new int[b][k], B = new int[b][k];
            System.out.println("Matriks A:");
            for (int i = 0; i < b; i++)
                for (int j = 0; j < k; j++) A[i][j] = in.nextInt();
            System.out.println("Matriks B:");
            for (int i = 0; i < b; i++)
                for (int j = 0; j < k; j++) B[i][j] = in.nextInt();
            System.out.println("Hasil:");
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < k; j++)
                    System.out.print((A[i][j] + B[i][j]) + "\t");
                System.out.println();
            }
        } else System.out.println("Pilihan salah");
        in.close();
    }
}
