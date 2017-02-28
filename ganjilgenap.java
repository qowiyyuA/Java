import java.io.*;


public class ganjilgenap{

	public static void main(String [] args)throws Exception{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int index = 1;
	int bts = 0;
	
	System.out.print("masukan batasan = ");
	bts = Integer.parseInt(br.readLine());
	
	
	while(index<=bts){
		if(index%2==0){
			System.out.println(index+" termasuk bilangan genap");
		}else{
			System.out.println(index+" termasuk bilangan ganjil");
		}
		
	}index++;
	}
}
}