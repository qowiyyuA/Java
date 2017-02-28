
import java.io.*;

public class Hello {

	public static void main(String[] args) {
		//BufferedReader dataDepan, dataBelakang = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader namaVariabel = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int angka1 =0;
		int beda = 0;
		
		
		
		
			try{
				System.out.print("masukan angka pertama :");
				angka1 = Integer.parseInt(br.readLine());
				
				System.out.print("masukan beda antar angka :");
				beda = Integer.parseInt(br.readLine());

				System.out.print("Masukan jumlah bilangan yang ingin di tampilkan");
				n = Integer.parseInt(br.readLine());
			}
			catch(IOException e){
				System.out.println("error");
			}
				System.out.println("");
			
			
			
	}
}