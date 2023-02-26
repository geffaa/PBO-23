import java.util.ArrayList;

public class assignment1 {
    public static void main(String[] args){

        int harga_cabai = 3000;
        int harga_bayam = 2000;
        int harga_bawang = 3000;
        int harga_tempe = 5000;
        int harga_beras = 20000;
        int harga_ayam = 20000;
        int harga_minyak = 12000;

        String[] belanja = {"cabai", "bayam", "bawang", "tempe", "beras"};

        ArrayList<String> belanjaan = new ArrayList<>();
        for (String barang : belanja) {
            if (barang.equals("cabai")) {
                belanjaan.add("ayam");
                belanjaan.add("minyak");
            } else {
                belanjaan.add(barang);
            }
        }

        int total_belanja = 0;
        for (String barang : belanjaan) {
            int harga = 0;
            if (barang.equals("cabai")) {
                harga = harga_cabai;
            } else if (barang.equals("bayam")) {
                harga = harga_bayam;
            } else if (barang.equals("bawang")) {
                harga = harga_bawang;
            } else if (barang.equals("tempe")) {
                harga = harga_tempe;
            } else if (barang.equals("beras")) {
                harga = harga_beras;
            } else if (barang.equals("ayam")) {
                harga = harga_ayam;
            } else if (barang.equals("minyak")) {
                harga = harga_minyak;
            }
            total_belanja += harga;
        }

        String keterangan_nilai = "";
        if (total_belanja < 50000) {
            keterangan_nilai = "uang Dina memenuhi";
        } else if (total_belanja == 50000) {
            keterangan_nilai = "uang Dina pas";
        } else {
            keterangan_nilai = "uang Dina tidak cukup";
        }

        System.out.println("Belanjaan Dina mula-mula :");
        for (String barang : belanja) {
            System.out.print(barang + " ");
        }

        System.out.println("Barang yang dibeli Dina : " + belanjaan);
        System.out.print("Total harga belanja Dina sebesar " + total_belanja);
        System.out.println(" jadi, "+keterangan_nilai);
    }
}
