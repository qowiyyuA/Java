import java.io.*;

public class Konversi_nilai_benar{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Masukan Nim :");
        String nim = br.readLine();

        System.out.print("Masukan Nama :");
        String nama = br.readLine();

        System.out.println("--------------------------------");
        System.out.println("1. Sistem Informasi");
        System.out.println("2. Sistem Komputer");
        System.out.println("3. Desain Komunikasi Visual");
        System.out.println("4. Desain Grafis");
        System.out.println("5. Multimedia");
        System.out.println("");
        System.out.print("Masukan Nomer sesuai prodi :");
        int pr = Integer.parseInt(br.readLine());
        System.out.println("--------------------------------");

        System.out.print("Masukan nilai tugas :");
        Double tugas = Double.parseDouble(br.readLine());

        System.out.print("Masukan nilai UTS   :");
        Double uts = Double.parseDouble(br.readLine());

        System.out.print("Masukan nilai UAS   :");
        Double uas = Double.parseDouble(br.readLine());

        String prodi="";

        Double ip = (((tugas*30)/100)+ ((uts*30)/100) + ((uas*40)/100));

        switch (pr){
          case 1:
          prodi = "Sistem Informasi (SI)";
          break;
          case 2:
          prodi = "Sistem Komputer (SK)";
          break;
          case 3:
          prodi = "Desain Komunikasi Visual";
          break;
          case 4:
          prodi = "Desain Grafis";
          break;
          case 5:
          prodi = "Multimedia";
          break;
          case 6:
          prodi = "Manajemen Informatika";
          break;
          default:
          prodi = "Tidak ada jurusan";
        }


        //output
        System.out.println("--------------------------------");
        System.out.println("Nim             : "+nim);
        System.out.println("Nama            : "+nama);
        System.out.println("Prodi           : "+prodi);
        System.out.println("Nilai angka     : "+ip);

        if (ip <=100 && ip >=80) {
            System.out.println("Nilai akhir     : A");
        }else if (ip <=79 && ip >=75) {
            System.out.println("Nilai akhir     : B+");
        }else if (ip <=74 && ip >=65) {
            System.out.println("Nilai akhir     : B");
        } else if (ip <=64 && ip>=60) {
            System.out.println("Nilai akhir     : C+");
        }else if (ip <=59 && ip>=50) {
            System.out.println("Nilai akhir     : C");
        }else if (ip<=49 && ip>=45) {
            System.out.println("Nilai akhir     : D");
        }else {
            System.out.println("Nilai akhir     : E");
        }


    }
}
