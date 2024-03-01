public class PersegiPanjang22 {
    public int panjang;
    public int lebar;

    public PersegiPanjang22() {
        panjang = 0;
        lebar = 0;
    }
    
    public PersegiPanjang22(int p, int l){
        panjang = p;
        lebar = l;
    }

    public void cetakInfo(){
        System.out.print("Panjang: " + panjang + ", Lebar: " + lebar + ", " );
        hitungLuasKeliling();
    }

    public void hitungLuasKeliling(){
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar); 
        System.out.println("Luas: " + luas + ", Keliling: " + keliling);
    }
}