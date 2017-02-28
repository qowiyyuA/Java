import java.io.*;

public class array{
	public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	
	
	System.out.print("masukan jumlah data :");
	int a = Integer.parseInt(br.readLine());
	
	String [] nama = new String [a];
	for(int i=0;i<a;i++){
		System.out.print("masukan data ke-"+i+":");
		nama[i] = br.readLine();
	}
	for(int i=0;i<a;i++){
		System.out.println("Data ke-"+i+"="+nama[i]);
	}
	}
}