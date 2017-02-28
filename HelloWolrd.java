import java.io.*;
 
public class HelloWolrd {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nama = "";
		int umur = 0;
		String alamat = "";
		
		int angka = 0;
		int angka1 = 0;
		int pertambahan = 0;
		int pengurangan = 0;
		int perkalian = 0;
		int pembagian = 0;
		
		
		System.out.print("masukan nama: ");
		nama = br.readLine();
		
		System.out.print("masukan umur: ");
		umur = Integer.parseInt(br.readLine());
		
		System.out.print("masukan alamat: ");
		alamat = br.readLine();
		
		System.out.println("");
		
		System.out.print("masuka angka ke 1= ");
		angka = Integer.parseInt(br.readLine());
		
		System.out.print("masukan angka ke 2= ");
		angka1 = Integer.parseInt(br.readLine());
		
		pertambahan = angka+angka1;
		pengurangan = angka-angka1;
		perkalian = angka*angka1;
		pembagian = angka/angka1;
		
		System.out.println("");
		System.out.println("nama : "+nama);
		System.out.println("umur : "+umur+" tahun");
		System.out.println("alamat : "+alamat);
		System.out.println("");
		System.out.println("angka ke 1= "+angka);
		System.out.println("angka ke 2= "+angka1);
		System.out.println("");
		System.out.println(angka+" + "+angka1+" = "+pertambahan);
		System.out.println(angka+" - "+angka1+" = "+pengurangan);
		System.out.println(angka+" x "+angka1+" = "+perkalian);
		System.out.println(angka+" : "+angka1+" = "+pembagian);
		
	}
}