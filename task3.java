import java.util.Scanner;

public class task3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan banyak baris : ");
        int x = scan.nextInt();
        System.out.println("Masukkan banyak kolom : ");
        int y = scan.nextInt();
        int [][] nomor = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Masukkan data ke - " + (i + 1) + "|" + (j + 1));
                nomor[i][j] = scan.nextInt();
            }
        }
    }
}
