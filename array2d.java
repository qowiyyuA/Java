import java.io.*;

public class array2d{
	public static void main(String [] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String rak[][]=new String [2][2];
		for(int i=0;i<2;i++){
			for(int p=0;p<2;p++){
				System.out.print("masukan jenis sepatu pada baris "+i+"dan kolom "+p+" = ");
				rak[i][p]=br.readLine();
			}
		}
		System.out.println("");
		System.out.print("masukan baris rak = ");
		int baris = Integer.parseInt(br.readLine());
		System.out.print("masukan kolom rak = ");
		int kolom = Integer.parseInt(br.readLine());
		System.out.print("rak pada baris "+baris+" dan kolom "+kolom+" berisi sepatu = "+rak[baris][kolom]);
	}
}	