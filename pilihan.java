import java.io.*;

public class pilihan{
	public static void main(String [] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Masukan nama :");
		String nama = br.readLine();
		
		String hasil[] = new String[nama.length()];
		
		for(int i=0; i<nama.length(); i++){
			String cek = nama.substring(i,i+1);
		
			if(cek.equalsIgnoreCase("a")){
				hasil[i] = "4";
			}else if(cek.equalsIgnoreCase("i")){
				hasil[i] = "1";
			}else if(cek.equalsIgnoreCase("u")){
				hasil[i] = "V";
			}else if(cek.equalsIgnoreCase("e")){
				hasil[i] = "3";
			}else if(cek.equalsIgnoreCase("o")){
				hasil[i] = "0";
			}else{
				hasil[i] = cek;
			}
		}
		
		for(int i=0;i<nama.length();i++){
			System.out.print(hasil[i]);
		}
	}
}