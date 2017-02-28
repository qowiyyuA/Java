import java.io.*;

public class qowi {

	public static void main(String [] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("-----------------------");

		String nama = "";
		String nim = "";
		int angka1 = 0;
		int angka2 = 0;
		int hasil = 0;
		int operator = 0;

		System.out.print("Masukan NIM : ");
		nim = br.readLine();

		System.out.print("Masukan nama: ");
		nama = br.readLine();

		System.out.println("-----------------------");
		System.out.println("Nim  : "+nim);
		System.out.println("Nama : "+nama);
		System.out.println("------------------------");

		System.out.print("Masukan angka ke 1: ");
		angka1 = Integer.parseInt(br.readLine());

		System.out.print("Masukan angka ke 2: ");
		angka2 = Integer.parseInt(br.readLine());

		System.out.println("------------------------");
		System.out.println("1. Pertambahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian");
		System.out.println("4. Pembagian");
		System.out.println(" ");
		System.out.print("Masukan operator: ");
		operator = Integer.parseInt(br.readLine());

		switch (operator){
			default:
			System.out.println("Tidak termasuk piihan");
			break;
			case 1:
				hasil = angka1 + angka2;
				System.out.println("Hasil -> "+angka1+" + "+angka2+" = "+hasil);
			break;
			case 2:
				hasil = angka1 - angka2;
				System.out.println("Hasil -> "+angka1+" - "+angka2+" = "+hasil);
			break;
			case 3:
				hasil = angka1 * angka2;
				System.out.println("Hasil -> "+angka1+" x "+angka2+" = "+hasil);
			break;
			case 4:
				hasil = angka1 / angka2;
				System.out.println("Hasil -> "+angka1+" : "+angka2+" = "+hasil);
			break;
			
		}

	}
}