import java.util.Scanner;

public class task2 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan yang ingin dipangkatkan : ");
        int angka = scan.nextInt();

        System.out.println("Masukkan bilangan pemangkat : ");
        int pangkat = scan.nextInt();

        //======================== for =============================
        int hasil_for = angka;

        for (int i = 1; i < pangkat ; i++){
            hasil_for = hasil_for*angka;
        }

        System.out.println("Hasilnya adalah : " + hasil_for);

        //======================== while =============================
        int hasil_while = angka;
        int x = 1;

        while (x < pangkat){
            hasil_while = hasil_while*angka;
            x += 1;
        }

        System.out.println("Hasilnya adalah : "+hasil_while);

        //======================== do =============================
        int hasildo = angka;
        int y = 1;

        do {
            hasildo = hasildo * angka;
            y += 1;
        }while(y<pangkat);

        System.out.println("Hasilnya adalah : "+hasildo);
    }
}
