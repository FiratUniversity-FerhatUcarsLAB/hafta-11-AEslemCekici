public class TarihYazdirma {
    public static void main(String[] args) {
        String gun = "Pazar";
        String ay = "Ocak";
        int tarih = 5;
        int yil = 2014;

        printAmerican(gun, tarih, ay, yil);

        printEuropean(gun, tarih, ay, yil);
    }
public static void printAmerican(String gün, int tarih, String ay, int yil) {
        System.out.println ("American:"+gün+ "," +ay+ "," +tarih+ "," +yil);
}
public static void printEuropean(String gün, int tarih, String ay, int yil) {
        System.out.println("Avrupa:"+gün+ "," +ay+ "," +tarih+ "," +yil);


    }
}
