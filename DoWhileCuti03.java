import java.util.Scanner;

/**
 * DoWhileCuti03
 */
public class DoWhileCuti03 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int jatahcuti, jumlahHari ;
    String konfirmasi ;

    System.out.print("jatah cuti : ");
    jatahcuti = sc.nextInt();

    do {
        System.out.print("Apakah anda ingin mengambil cuti (y/t) ? ");
        konfirmasi = sc.next() ;

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Jumlah hari : ");
            jumlahHari = sc.nextInt();

        if (jumlahHari <= jatahcuti) {
            jatahcuti -= jumlahHari;
            System.out.println("Sisa jatah cuti: " + jatahcuti);
        } else {
            System.out.println("Sisa jatah cuti Anda tidak mencukupi ");
            continue;
        }
            
        }else{
            System.out.println("Program dihentikan");
            break;
        } 
        
        } while (jatahcuti > 0);
    }
}