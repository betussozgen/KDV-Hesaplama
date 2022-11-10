import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double KDV_ORANI = 0.18;
        double tutar;
        double KdvTutari;
        double KdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        tutar = input.nextDouble();

        System.out.println("KDV Oranı: " + KDV_ORANI);
        System.out.println("KDV'siz Fiyat: " + tutar);

        KdvTutari = tutar * KDV_ORANI;
        System.out.println("KDV Tutarı: " + KdvTutari);

        KdvliTutar = tutar + KdvTutari;
        System.out.println("KDV'li Fiyat: " + KdvliTutar);

        System.out.println("------------------------ÖDEV------------------------");
        if (tutar >= 0 && tutar <= 1000){
            KDV_ORANI = 0.18;
            KdvTutari = tutar * KDV_ORANI;
            KdvliTutar = tutar + KdvTutari;

            System.out.println("----------KDV %18----------");
            System.out.println("KDV Oranı: " + KDV_ORANI);
            System.out.println("KDV'siz Fiyat: " + tutar);
            System.out.println("KDV Tutarı: " + KdvTutari);
            System.out.println("KDV'li Fiyat: " + KdvliTutar);
        }
        else{
            KDV_ORANI = 0.08;
            KdvTutari = tutar * KDV_ORANI;
            KdvliTutar = tutar + KdvTutari;

            System.out.println("----------KDV %8----------");
            System.out.println("KDV Oranı: " + KDV_ORANI);
            System.out.println("KDV'siz Fiyat: " + tutar);
            System.out.println("KDV Tutarı: " + KdvTutari);
            System.out.println("KDV'li Fiyat: " + KdvliTutar);
        }
    }
}
