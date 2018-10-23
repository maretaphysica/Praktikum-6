import javax.swing.JOptionPane;
public class JOption1{
    public static void main(String[]args){
        String nama, nim, tempat,tgllahir;

        nama= JOptionPane.showInputDialog("Inputkan nama anda : ");
        

        nim= JOptionPane.showInputDialog("Inputkan NIM anda : ");
        
        tempat= JOptionPane.showInputDialog("Inputkan Tempat lahir anda : ");
        

        tgllahir= JOptionPane.showInputDialog("Inputkan Tanggal lahir anda : ");
        
        String msg= "Selamat datang "+nama
        +"\nNIM anda\t: "+nim
        +"\nTempat lahir\t: "+tempat
        +"\nTanggal lahir\t: "+tgllahir;

        JOptionPane.showMessageDialog(null,msg);
       
    }
    
}