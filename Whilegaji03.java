import java.util.Scanner;

/**
 * Whilegaji03
 */
public class Whilegaji03 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String jabatan ;
    int jumlahkaryawan, jumlahjamlembur ;
    double gajilembur, totalgajilembur ;
    gajilembur = 0 ;
    totalgajilembur = 0 ;
    
    System.out.print("Masukan jumlah karyawan : ");
    jumlahkaryawan = scan.nextInt();

    int i = 0;

    while (i < jumlahkaryawan) {
        System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        System.out.print("Masukan jabatan karyawan ke-" + (i+1) + ": ");
        jabatan = scan.next();
        System.out.print("Masukan jumlah jam lembur : ");
        jumlahjamlembur = scan.nextInt();
        i++;

    if (jabatan.equalsIgnoreCase("Direktur")) {
        continue;
    } else if (jabatan.equalsIgnoreCase("Manajer")) {
        gajilembur = jumlahjamlembur * 100000;
    } 
    else if (jabatan.equalsIgnoreCase("karyawan")) {
        gajilembur = jumlahjamlembur  * 75000;
    } else { 
        --i;
        System.out.println("Jabatan Invalid");
    }
    
    totalgajilembur += gajilembur;

    System.out.println("Total gaji lembur: " + totalgajilembur);



        
    }
    }
}