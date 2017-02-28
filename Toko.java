import java.io.*;

public class Toko{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("       ========================================");
        System.out.println("                 Input Data Pelanggan");
        System.out.println("           Toko Buku 'Cahaya Ilmu sejati' ");
        System.out.println("           Jln. Kebon jahe no.23,sidoarjo");
        System.out.println("       ========================================");
        System.out.println("");

        System.out.print("Masukan nama depan :");
        String ndepan = br.readLine();

        System.out.print("Masukan nama belakang :");
        String nbelakang = br.readLine();

        System.out.print("Masukan alamat : ");
        String alamat = br.readLine();

        System.out.print("Masukan tempat lahir : ");
        String tlahir = br.readLine();

        System.out.print("Masukan tanggal lahir :");
        String tmlahir = br.readLine();

        System.out.print("Masukan usia: ");
        int umur = Integer.parseInt(br.readLine());

        //output
        System.out.println("");
        System.out.println("       ========================================");
        System.out.println("                     Data Pelanggan");
        System.out.println("           Toko Buku 'Cahaya Ilmu sejati' ");
        System.out.println("           Jln. Kebon jahe no.23,sidoarjo");
        System.out.println("       ========================================");
        System.out.println("");
        System.out.println("Nama lengkap  : "+ndepan+" "+nbelakang );
        System.out.println("Alamat        : "+alamat);
        System.out.println("tempat Lahir  : "+tlahir);
        System.out.println("Tanggal Lahir : "+tmlahir);
        System.out.println("Usia          : "+umur);
        

    }
}
