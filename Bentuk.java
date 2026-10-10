// Class Bentuk: ini class induk (orang tuanya)
// Semua bentuk pasti punya warna, jadi warna disimpan di sini
public class Bentuk {

    // warna dibuat protected supaya bisa dipakai class anak-anaknya
    protected String warna;

    // constructor: dipanggil waktu bentuk baru dibuat
    public Bentuk(String warna) {
        this.warna = warna;
    }

    // mengambil warna
    public String getWarna() {
        return warna;
    }

    // mengubah warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // menampilkan info bentuk ke layar
    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}
