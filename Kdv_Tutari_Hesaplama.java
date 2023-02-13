import java.util.Scanner;
/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.


*/

public class Kdv_Tutari_Hesaplama {
    public static void main(String[] args) {
        double kdv = 0.18;
        double kdv2 = 0.08;
        Scanner para = new Scanner(System.in);
        System.out.print("Ödemek istediğiniz miktarı giriniz: ");
        double money = para.nextDouble();
        double kdvtutari = (money*kdv);
        double kdvtutari2 = (money>0 && money<1000 ? kdvtutari : (0.08*money));
        double total = kdvtutari2 + money;



        System.out.println("KDV'siz Fiyat:"+money);
        System.out.println("KDV'li Fiyat:"+ total);
        System.out.println("KDV Tutarı:"+kdvtutari2);

        System.out.println(money<1000 && money>0? "%18 KDV Uygulanmıştır." : "%8 KDV Uygulanmıştır.");





    }
}
