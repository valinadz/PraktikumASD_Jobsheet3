import java.util.Scanner;
public class PersegiPanjang22 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang22[] arrayOfPersegiPanjang22 = new PersegiPanjang22[3];

        arrayOfPersegiPanjang22[0] = new PersegiPanjang22();
        arrayOfPersegiPanjang22[0].panjang = 110;
        arrayOfPersegiPanjang22[0].lebar = 30;

        arrayOfPersegiPanjang22[1] = new PersegiPanjang22();
        arrayOfPersegiPanjang22[1].panjang = 80;
        arrayOfPersegiPanjang22[1].lebar = 40;

        arrayOfPersegiPanjang22[2] = new PersegiPanjang22();
        arrayOfPersegiPanjang22[2].panjang = 100;
        arrayOfPersegiPanjang22[2].lebar = 20;

        System.out.println("Persegi panjang ke-1, panjang: " + arrayOfPersegiPanjang22[0].panjang + ", lebar: " + arrayOfPersegiPanjang22[0].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " + arrayOfPersegiPanjang22[1].panjang + ", lebar: " + arrayOfPersegiPanjang22[1].lebar);
        System.out.println("Persegi panjang ke-3, panjang: " + arrayOfPersegiPanjang22[2].panjang + ", lebar: " + arrayOfPersegiPanjang22[2].lebar);
    }
}