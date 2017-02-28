import java.io.*;

public class bintang{

	public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int batas;

	System.out.print("Masukan Batasan: ");
	batas = Integer.parseInt(br.readLine());

		for(int a= 1;a<=batas;a++){
			for(int b = 1;b<=a;b++){

			System.out.print("*");

		}System.out.println("");
		}

		/*for(int batas = batas;batas>=1;batas--){
			for(int b = b;b>=1;b--){

			System.out.print("*");

		}System.out.println("");
	}*/
	}
}
