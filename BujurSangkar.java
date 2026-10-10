// Class BujurSangkar: anak dari class Bentuk
// "extends Bentuk" artinya BujurSangkar otomatis punya warna, getWarna(), dan setWarna()
public class BujurSangkar extends Bentuk {

    // panjang sisi bujur sangkar
    private double sisi;

    // constructor: butuh sisi dan warna
    public BujurSangkar(double sisi, String warna) {
        super(warna);      // warna dikirim ke class induk (Bentuk)
        this.sisi = sisi;
    }

    // mengambil nilai sisi
    public double getSisi() {
        return sisi;
    }

    // mengubah nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // menghitung luas: sisi x sisi
    public double hitungLuas() {
        return sisi * sisi;
    }

    // menampilkan info (menimpa printInfo milik Bentuk)
    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + warna + ", luas = " + hitungLuas());
    }
}
