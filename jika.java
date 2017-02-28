import java.io.*;

public class jika{

	public static void main(String [] args) throws Exception{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Menghitung nilai rata-rata mahasiswa");
	System.out.println("====================================");
	System.out.println("");
	
	int	tugas = 0;
	int uts = 0;
	int uas = 0;
	int hasil = 0;
	
	
				System.out.print("masukan nilai tugas : ");
				tugas = Integer.parseInt(br.readLine());
				
				System.out.print("masukan nilai uts : ");
				uts = Integer.parseInt(br.readLine());

				System.out.print("Masukan nilai UAS : ");
				uas = Integer.parseInt(br.readLine());
	
	tugas = (tugas*40)/100;
	uts = (uts*30)/100;
	uas = (uas*30)/100;
	hasil = tugas+uts+uas;
	
	if(hasil<=60){
	System.out.println("anda termasuk dalam kategori D, dengan nilai "+hasil);
	}else if(hasil>=61 && hasil<=70){
	System.out.println("anda termasuk dalam kategori C, dengan nilai "+hasil);
	}else if(hasil>=71 && hasil<=80){
	System.out.println("anda termasuk dalam kategori B, dengan nilai "+hasil);
	}else if(hasil>=81 && hasil<=100){
	System.out.println("anda termasuk dalam kategori A, dengan nilai "+hasil);
	}else
	System.out.println("nilai anda tidak termasuk dalam kategori");
	}
	
}