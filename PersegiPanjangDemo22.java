import java.util.Scanner;

public class PersegiPanjangDemo22 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Panjang Array :");
        int panjangArr = sc.nextInt();

        PersegiPanjang22[] arrPersegiPanjang = new PersegiPanjang22[panjangArr];
        int panjang, lebar;

        for (int i = 0; i < panjangArr; i++) {

            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.print("Masukkan Panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            lebar = sc.nextInt();

            arrPersegiPanjang[i] = new PersegiPanjang22(panjang, lebar);

            System.out.println("=================================================");

        }
        
        for (int i = 0; i < panjangArr; i++) {
            System.out.println(" ");
            System.out.print("Persegi Panjang ke-" + (i + 1)+ " "); 
            arrPersegiPanjang[i].cetakInfo();
            
        sc.close();
        }

    }

}