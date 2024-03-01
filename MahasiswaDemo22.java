import java.util.Scanner;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            scanner.nextLine(); 
            System.out.println("Data Mahasiswa " + (i + 1) + " :");

            System.out.print("Nama : ");
            String nama = scanner.nextLine();

            System.out.print("NIM : ");
            String nim = scanner.nextLine();

            System.out.print("Jenis Kelamin : ");
            char jenisKelamin = scanner.next().charAt(0);

            System.out.print("IPK : ");
            double ipk = scanner.nextDouble();

            arrayMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        // Tampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa " + (i + 1) + " :");
            arrayMahasiswa[i].tampilkanInfo();
        }

        // Hitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("\nRata-rata IPK: " + rataRataIpk);

        scanner.close();
    }
}