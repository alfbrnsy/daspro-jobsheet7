import java.util.Scanner;

/**
 * ForKelipatan03
 */
public class WhileKelipatan{

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int kelipatan, jumlah, counter, total;
    jumlah = 0;
    counter = 0;
    double rata_rata = 0;
   
    System.out.print("Masukkan Bilangan Kelipatan (1-9) : ");
    kelipatan = scan.nextInt();
       
    int i = 1 ; 
    while ( i <= 50) {
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;     
            rata_rata= (double)jumlah/counter;
            
        }
        i++;
         } System.out.printf("Banyak bilangan %d dari 1 sampe 50 adalah &d\n", kelipatan, counter) ;
           System.out.printf("Total bilangan kelipatan %d dari 1 sampe 50 adalah %d\n", kelipatan, jumlah);
           System.out.printf("Rata-Rata dari seluruh bilangan kelipatan %d dari 1 sampe 50 adalah %.2f, ", kelipatan, rata_rata);

    }
}