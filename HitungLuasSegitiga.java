public class HitungLuasSegitiga {


//    float = luas,alas,tinggi;

//    private atribut
//    private atribut hanya dapat diakses dalam class yang sama
//    private float alas;
    private float alas;
    private float tinggi;
    float luas;

//  nama construktor harus sama dengan nama kelas
//    konstruktor akan digunakan saat ada object yang menggunakan nama kelas
//    konstruktor dapat berisi/tidak berisi parameter
    public HitungLuasSegitiga(float AL, float TG){
//        mengambil dari method
//        this.SetAlas(AL);
//        this.SetTinggi(TG);

//        menga,bil langsung dari atribut.
//        saat cara ini digunakan maka kita tidak perlu membuat method terpisah
        this.alas = AL;
        this.tinggi = TG;
    }


//    method alas dengan parameter float untuk set nilai atribut alas
//    method dijadikan private saat sudah ada konstruktor pada kelas yang sama agar method tidak dapat diakses pada kelas lain
//    private void SetAlas(float AL){
//        this.alas = AL;
//    }


//  method setTinggi dengan parameter float untuk set nilai ke atribut tinggi
//    public void SetTinggi(float TG) {
//        this.tinggi = TG;
//    }


//    method private tanpa mengembalikan nilai == tanpa param untuk menghitung luas segitiga
    private float HitungLuas(){
        this.luas = (float) (0.5 * this.alas * this.tinggi);

//        mengembalikan nilai luas
        return luas;
    }

//    public method untuk menampilkan hasil
    public void CetakLuas(){
//        memanggil method private hitung luas
        this.HitungLuas();
//          menampilkan atribut
        System.out.println("Hitung Luas Segitiga");
        System.out.println("================================");
        System.out.println("Nilai Alas Segitiga : " + this.alas + " CM²");
        System.out.println("Nilai Tiggi Segitiga: " + this.tinggi + " CM²");
        System.out.println("Total Luas Segitiga : " + this.luas + " CM²");

    }
}
