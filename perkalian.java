import java.io.*;

public class perkalian {

	public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("program tabel perkalian");
	
	int angka = 1;
	int index = 1;
	int batas = 0;
	int hasil = 0;
	
	System.out.print("Masukan Batasan: ");
	batas = Integer.parseInt(br.readLine());
		
	while(index<=batas){
		while(angka<=10){
			hasil = angka*index;
			System.out.println(angka+" x "+index+" = "+hasil);
			angka++;
		}
		angka = angka-11+1; 
		index++;
		System.out.println("");
	}
	}
}