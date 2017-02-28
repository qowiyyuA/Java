import java.io.*;

public class Kalkulator{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama,nim;
        double angka1,angka2,tambah,kurang,kali,bagi;

        System.out.print("Masukan NIM  : ");
        nim = br.readLine();

        System.out.print("Masukan Nama : ");
        nama = br.readLine();
        
		System.out.println("--------------");
        
		System.out.print("Masukan angka ke-1 : ");
        angka1 = Double.parseDouble(br.readLine());

        System.out.print("Masukan angka ke-2 : ");
        angka2 = Double.parseDouble(br.readLine());

        tambah = angka1+angka2;
        kurang = angka1-angka2;
        kali   = angka1*angka2;
        bagi   = angka1/angka2;
		
        System.out.println("------------- Hasil -------------");
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("..................");
        System.out.println("Kalkulator");
        System.out.println(angka1+" + "+angka2+" = "+tambah);
        System.out.println(angka1+" - "+angka2+" = "+kurang);
        System.out.println(angka1+" x "+angka2+" = "+kali);
        System.out.println(angka1+" : "+angka2+" = "+bagi);


    }
}