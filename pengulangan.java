import java.io.*;


public class pengulangan{

	public static void main(String [] args)throws Exception{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int index = 1;
	int bts = 0;
	
	System.out.print("masukan batasan = ");
	bts = Integer.parseInt(br.readLine());
	
	System.out.println("");
	
	do{
		System.out.println(index);
		index++;
	}while(index<=bts);
	}
}