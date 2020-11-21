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
public class WarnaKoordinat extends Koordinat {
public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x,y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna(){
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
}