import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader1{
    public static void main(String[]args)throws IOException{
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String nim="", nama="", tempat="", tgllahir="";
        System.out.print("Masukkan Nama anda : ");
        nama=dataIn.readLine();

        System.out.print("Masukkan NIM anda : ");
        nim=dataIn.readLine();

        System.out.print("Masukkan Tempat Lahir anda : ");
        tempat=dataIn.readLine();

        System.out.print("Masukkan Tanggal Lahir anda : ");
        tgllahir=dataIn.readLine();

        System.out.println("");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("Selamat datang "+nama);
        System.out.println("NIM "+nim);
        System.out.println("Tempat lahir "+tempat);
        System.out.println("Tanggal Lahir "+tgllahir);
    }
}