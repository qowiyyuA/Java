import java.io.*;

public class tugas1 {
	public static void main (String[]args) throws IOException{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("==========================");
			System.out.println("  Toko Buku Khatulistiwa  ");
			System.out.println("==========================");
			
			System.out.print("No. Transaksi : ");
			int nomor = Integer.parseInt(input.readLine());
			
			System.out.print("Nama Pelanggan : ");
			String nama = input.readLine();
			
			System.out.print("Judul Buku yang dibeli : ");
			String judul = input.readLine();
			
			System.out.print("Jumlah Buku yang dibeli : ");
			int jumlah = Integer.parseInt(input.readLine());
			
			System.out.print("Harga Buku (Rp) : ");
			int hargaBuku = Integer.parseInt(input.readLine());	

		System.out.println("==========================");
		System.out.println("     Nota Penjuaalan      ");
		System.out.println("==========================");	
		System.out.println("No. Transaksi : "+nomor);
		System.out.println("Nama Pelanggan : "+nama);
		
		int totalSebelum = jumlah*hargaBuku;
		double diskon10 = totalSebelum*0.1;
		double diskon5 = totalSebelum*0.05;
		
		System.out.println("Harga Sebelum Diskon : Rp. "+totalSebelum);
		
		if (totalSebelum > 150000 && nomor <= 50) {
			System.out.println("Diskon 10% : Rp. "+diskon10);
			System.out.println("Diskon 5% : Rp. "+diskon5);
			System.out.println("Harga Sesudah Diskon : Rp. "+(totalSebelum-(diskon10+diskon5)));
		}else if (totalSebelum >= 150000){
			System.out.println("Diskon 10% : Rp. "+diskon10);
			System.out.println("Harga Sesudah Diskon : Rp. "+(totalSebelum-diskon10));
		}else if (nomor <= 50){
			System.out.println("Diskon 5% : Rp. "+diskon5);
			System.out.println("Harga Sesudah Diskon : Rp. "+(totalSebelum-diskon5));
		}	
	}
}