package RestaurantBillGenerator.Practice;

import java.util.Scanner;

/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsünü gösterme, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
public class RestaurantBillGeneratorP {

    public static void main(String[] args) {

        getSelectionMenu();


    }

    //1- İşlem seçim menüsünü göstereceğimiz için method oluşturduk.
    public static void getSelectionMenu() {
        Scanner input  = new Scanner(System.in);

    // 3- Yiyecekler için Class oluşturalım: Dish







    // 2- tekrar tekrar menüyü göstermemiz gerekiyor.
        int select = -1;

        while (select!=0) {
            System.out.println("--------------------------------------------------------");
            System.out.println(" *** Didoş Restaraunt Sipariş Uygulaması *** ");
            System.out.println(" 1- Menü");
            System.out.println(" 2- Sipariş Girişi");
            System.out.println(" 3- Sipariş İptali");
            System.out.println(" 4- Hesap Oluştur");
            System.out.println(" 0 Çıkış");
            System.out.println("--------------------------------------------------------");
            select = input.nextInt();

            switch (select) {
                case 1:
                    // Menü
                    break;
                case 2:
                    // Sipariş Girişi
                    break;
                case 3:
                // Sipariş İptali
                    break;
                case 4:
                    // Hesap Oluştur
                    break;
                case 0:
                    System.out.println(" İyi günler dileriz ");
                    break;
                default:
                    System.out.println("Lütfen 0 ve 4 arasında geçerli bir rakam giriniz,");
                    break;

            }

        }


    }

}
