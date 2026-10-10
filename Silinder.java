// Class Silinder: anak dari class Lingkaran
// (alasannya: alas silinder itu lingkaran)
// Silinder otomatis dapat warna dari Bentuk dan radius dari Lingkaran
public class Silinder extends Lingkaran {

    // tinggi silinder
    private double tinggi;

    // constructor: butuh tinggi, radius, dan warna
    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);   // radius dan warna dikirim ke class induk (Lingkaran)
        this.tinggi = tinggi;
    }

    // mengambil tinggi
    public double getTinggi() {
        return tinggi;
    }

    // mengubah tinggi
    public void setTinggi(double t) {
        tinggi = t;
    }

    // menghitung volume: luas alas (lingkaran) x tinggi
    public double hitungVolume() {
        return hitungLuas() * tinggi;   // hitungLuas() warisan dari Lingkaran
    }

    // menampilkan info (menimpa printInfo milik Lingkaran)
    public void printInfo() {
        System.out.println("Silinder warna " + warna + ", volume = " + hitungVolume());
    }
}
