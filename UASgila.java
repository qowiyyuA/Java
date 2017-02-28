import java.io.*;

class UASgila {

	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Program Arif Kusdiantoro");
		System.out.println("-----------------------");

		String nama = "";
		String nim = "";
		String grade ="";

		System.out.print("Masukan NIM : ");
		nim = br.readLine();

		System.out.print("Masukan nama: ");
		nama = br.readLine();
		
		System.out.println("Nim  : "+nim);
		System.out.println("Nama : "+nama);
		
		System.out.println("------------------------");
		System.out.println("1. Sistem informasi");
		System.out.println("2. Sistem komputer");
		System.out.println("3. Desain Komputer Visual ");
		System.out.println(" ");
		System.out.print("Masukan Jurusan : ");
		int angka = Integer.parseInt(br.readLine());
		
		switch (angka){
		case 1 :
			System.out.println("Sistem Informasi"); break;
		case 2 :
			System.out.println("Sistem Komputer"); break;
		case 3 :
			System.out.println("Desain Komputer Visual"); break;
		default:
			System.out.println("Tidak ada"); break;
		}
		
		System.out.print("Nilai tugas : ");
        int n_tugas = Integer.parseInt(br.readLine());
        
		System.out.print("Nilai uts : ");
        int n_uts = Integer.parseInt(br.readLine());
        
		System.out.print("Nilai uas : ");
        int n_uas = Integer.parseInt(br.readLine());
        
		int n_akhir = (((40 * n_tugas)/100) + ((30 * n_uts)/100) + ((30 * n_uas)/100));
        if (n_akhir >= 85 && n_akhir <=100){
            grade = "A";
        }
        else if (n_akhir > 75 && n_akhir < 85){
            grade = "B";
        }
        else if (n_akhir > 65 && n_akhir < 75){
            grade = "C";
        }
        else if (n_akhir > 50 && n_akhir < 65){
            grade = "D";
        }
        else {
            grade = "E";
        }
        if (grade == "A" || grade == "B" || grade == "C"){
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
			+ "\n dan dinyatakan Tidak Lulus");
		}
	}	
}