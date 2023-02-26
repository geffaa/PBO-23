import java.util.Scanner;

public class task1 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Nilai yang ingin difaktorialkan : ");
        int angka = scan.nextInt();

        //=================================== while ===========================================
        int hasil = 1;
        int x = 1;
        while (x <= angka){
            hasil = hasil * x;
            x += 1;
        }

        System.out.println("Hasil Faktorial : " + hasil);

        //=================================== do ===========================================
        int hsl = 1;
        int y = 1;

        do{
            hsl = hsl * y;
            y += 1;

        } while (y <= angka);

        System.out.println("Hasil Faktorial : " + hsl);

    }
}
