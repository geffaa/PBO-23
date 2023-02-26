import java.util.Scanner;

public class assignment2 {
    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Jumlah mainan yang dibeli : ");

        int mainan = scan.nextInt();
        int sisa = mainan%3;

        if (sisa > 0){
            System.out.println("Mainan sisa : "+1);
        }
        else {
            System.out.println("Mainan pas");
        }
    }

}
