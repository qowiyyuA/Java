import java.io.*;

public class Aritmatika{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bil1,beda,banyak,hasil;

        System.out.print("Bilangan pertama :");
        bil1 = Integer.parseInt(br.readLine());

        System.out.print("Bilangan beda    :");
        beda = Integer.parseInt(br.readLine());

        System.out.print("Banyak           :");
        banyak = Integer.parseInt(br.readLine());

        System.out.println("-------------------------");
        for (int a=1;a<=banyak;a++){
            hasil = bil1+((a-1)*beda);
            System.out.println("bilangan ke-"+a+" -> "+bil1+" + (("+a+" - 1) x "+beda+") = "+hasil);
            hasil = hasil-hasil;

        }





    }
}