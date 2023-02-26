import java.util.Scanner;

public class task4 {

    public static void main(String[] args){

        System.out.println("Masukkan Kata : ");
        Scanner scan = new Scanner(System.in);
        String kata = scan.nextLine();

        String hasil = "";

        for (int i = kata.length()-1; i >= 0; i--){
            hasil = hasil + kata.charAt(i);
        }

        System.out.println("Hasil kata yang dibalik : " + hasil);
    }

}
