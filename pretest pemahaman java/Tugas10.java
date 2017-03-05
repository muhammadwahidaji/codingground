public class Tugas10{
	public static void main(String[] args){
		Biodata_Tugas10 b = new Biodata_Tugas10();

		b.setNama("Muhamad Wahid");
		b.setUmur(21);
		b.setAlamat("Mlonggo");

		String namaPrint = b.getNama();
		int umurPrint = b.getUmur();
		String alamatPrint = b.getAlamat();

		System.out.println("Nama : " + namaPrint + "\nAlamat : " + alamatPrint + "\nUmur : " + umurPrint);
	}
}