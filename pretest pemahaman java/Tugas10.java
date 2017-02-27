class GetterSetter {
    private String umur;
    private String nama;
    protected String alamat;
  
 
    public String getUmur() {
        return umur;
    }
 
    public void setUmur(String umur) {
        this.umur = umur;
    }
     public String getAlamat() {
        return alamat;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
}

public class Tugas10 {
    public static void main(String[] buaya) {
        // Mengeset nilai atribut objek-objek instance kelas
        // ContohKelasPakaiGetterSetter
        GetterSetter objekKelas_1 = new GetterSetter();
        objekKelas_1.setUmur("19");
        objekKelas_1.setNama("AJE");
        objekKelas_1.setAlamat("Jeporo");
        
         String umur_1 = objekKelas_1.getUmur();
        String nama_1 = objekKelas_1.getNama();
        String alamat_1 = objekKelas_1.getAlamat();
        
        System.out.println( "\tNAMA  : " + nama_1 + "UMUR  : " + umur_1 
                + "\tALAMAT  : " + alamat_1 );
 
    }}
 