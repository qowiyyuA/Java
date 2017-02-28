import java.io.*;

public class perkalianf{

	public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int batas,hasil;

	System.out.print("Masukan Batasan: ");
	batas = Integer.parseInt(br.readLine());
		
	for(int index= 1;index<=batas;index++){
		for(int angka = 1;angka<=10;angka++){
			hasil = angka*index;
			System.out.println(angka+" x "+index+" = "+hasil);
			
		}
		
		System.out.println("");
	}
	}
}