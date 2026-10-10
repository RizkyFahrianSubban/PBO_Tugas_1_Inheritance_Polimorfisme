// Class Main: tempat mencoba semua class
public class Main {
    public static void main(String[] args) {

        // 1. coba class Bentuk
        Bentuk bentuk1 = new Bentuk("Merah");
        bentuk1.printInfo();

        // coba ganti warna lalu tampilkan lagi
        bentuk1.setWarna("Kuning");
        System.out.println("Warna sekarang: " + bentuk1.getWarna());

        // 2. coba class BujurSangkar
        BujurSangkar kotak = new BujurSangkar(5, "Biru");
        kotak.printInfo();

        // coba ganti sisinya
        kotak.setSisi(10);
        System.out.println("Sisi sekarang: " + kotak.getSisi());
        kotak.printInfo();

        // 3. coba class Lingkaran
        Lingkaran bulat = new Lingkaran(7, "Hijau");
        bulat.printInfo();

        // 4. coba class Silinder
        Silinder tabung = new Silinder(10, 7, "Ungu");
        tabung.printInfo();

        // 5. coba semua bentuk sekaligus pakai array
        // bisa begini karena semua class adalah anak (turunan) dari Bentuk
        System.out.println();
        System.out.println("Semua bentuk dalam satu array:");
        Bentuk[] semuaBentuk = new Bentuk[4];
        semuaBentuk[0] = new Bentuk("Putih");
        semuaBentuk[1] = new BujurSangkar(4, "Hitam");
        semuaBentuk[2] = new Lingkaran(3, "Oranye");
        semuaBentuk[3] = new Silinder(5, 2, "Coklat");

        for (int i = 0; i < semuaBentuk.length; i++) {
            semuaBentuk[i].printInfo();   // yang jalan sesuai jenis objeknya
        }
    }
}
