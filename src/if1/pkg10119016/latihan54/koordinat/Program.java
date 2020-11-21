package if1.pkg10119016.latihan54.koordinat;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menampilkan koordinat x&y
 */
public class Program {

    public static void main(String[] args) {
     
        WarnaKoordinat oo = new WarnaKoordinat(10,4,"Jingga");
        
        System.out.println("Warna koordinat : " + oo.getNamaWarna());
        System.out.println("Koordinat sumbu x : " + oo.getX() + ", y : " + oo.getY());
        
    }
    
}