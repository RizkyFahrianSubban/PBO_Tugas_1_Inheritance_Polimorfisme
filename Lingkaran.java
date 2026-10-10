// Class Lingkaran: anak dari class Bentuk
public class Lingkaran extends Bentuk {

    // PHI dibuat konstanta (final) supaya nilainya tidak bisa berubah
    // static artinya milik class, bukan milik tiap objek
    public static final double PHI = 3.14;

    // jari-jari lingkaran
    private double radius;

    // constructor: butuh radius dan warna
    public Lingkaran(double radius, String warna) {
        super(warna);      // warna dikirim ke class induk (Bentuk)
        this.radius = radius;
    }

    // mengambil nilai radius
    public double getRadius() {
        return radius;
    }

    // mengubah nilai radius
    public void setRadius(double r) {
        radius = r;
    }

    // menghitung luas lingkaran: PHI x radius x radius
    public double hitungLuas() {
        return PHI * radius * radius;
    }

    // menampilkan info (menimpa printInfo milik Bentuk)
    public void printInfo() {
        System.out.println("Lingkaran " + warna + ", luas = " + hitungLuas());
    }
}
