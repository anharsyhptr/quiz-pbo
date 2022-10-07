import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class program2{
    public static void main(String [] args) throws Exception {

    ArrayList<program1> p = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
   // Scanner sca = new Scanner(System.in);
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    Integer pil,pil1,transportasi,pjasa,jasa,total,alat,js;
    String nama, alamat, notlp, email, ket, pilihan,cetak;

   
        System.out.println("---Car Cleaning.. Anda Pesan Kami Datang---");
        System.out.println("===========================================");
        System.out.println();
        System.out.println("-------------------oOo---------------------");

        System.out.println("*Masukan Data pesanan*");
        System.out.println("Masukan nama");
        nama = sc.nextLine();
        System.out.println("Masukan Alamat");
        alamat = sc.nextLine();
        System.out.println("Masukan No. Tlp");
        notlp = sc.nextLine();
        System.out.println("Masukan Email");
        email=sc.nextLine();

        System.out.println();

        
            System.out.println("*Jenis Jasa*");
            System.out.println("1. Cuci Mobil");
            System.out.println("2. Salon Mobil Interior");
            System.out.println("3. Salon Mobil Eksterior");
            System.out.print("Pilih Jasa : ");
            pil1= sc.nextInt();

            System.out.println("*Team Penyedia Jasa*");
            System.out.println("1. Team Sea [2 Orang]");
            System.out.println("2. Team Mountain [4 Orang]");
            System.out.println("3. Team Forest [5 Orang]");
            System.out.print("Pilih Team : ");
            pil = sc.nextInt();

            System.out.println();

            System.out.println("Berikan Keterangan Pemesan");
            cetak = br.readLine();
            

            System.out.println();

            System.out.print("Masukan biaya Penyedia Jasa   Rp.");
            pjasa = sc.nextInt();
            System.out.print("Masukan biaya Jasa Alat       Rp.");
            alat = sc.nextInt();
            System.out.print("Masukan biaya Bahan Jasa      Rp.");
            jasa = sc.nextInt();
            System.out.print("Masukan biaya Transportasi    Rp.");
            transportasi = sc.nextInt();
            total = pjasa+alat+jasa+transportasi;

        System.out.println("=============================================");
        System.out.println("---------------------oOo---------------------");

        System.out.print("Jasa yang di pesan    : ");
        if (pil1 == 1) {
            System.out.println("Cuci Mobil");
        } else if (pil1 == 2) {
            System.out.println("Salon Mobil Interior");
        } else if (pil1 == 3) {
            System.out.println("Salon Mobil Eksterior");
        }
        System.out.print("Nama Penyedia Jasa    : ");
        if (pil == 1) {
            System.out.println("1.Team Sea[2 orang]");
        } else if (pil == 2) {
            System.out.println("2.Team Mountain[4 orang]");
        } else if (pil == 3) {
            System.out.println("3.Salon Mobil Eksterior");
        }
        System.out.print("Keterangan            : ");
        System.out.println(cetak);
        System.out.println("");
        System.out.print("Total biaya yang di bayar pemesanan : Rp.");
        System.out.println(total);
        System.out.println("");
    
    }
}
    
        
    