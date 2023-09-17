package aracSigortaApp;


/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.

        1- Hoca önce start(); ve start methodu oluşturdu
        2- Scanner oluşturduk ve isAgain booleanı ekledi 3. adımda else'de kullanacağız
        3- do while oluşturarak form yaptık, sonra term adında bir değer belirleyerek input scanner yaptık
        dah sonra termName şeklinde ternary oluşturduk Haziran mı Aralık mı dönemi seçmek için. ==1 ise...
        ardından if açtık. tarife doğruysa veya hatalıysa diye. 1 or 2 veya else
        4-  type ve prim şeklinde objeler oluşturduk.
        5- method oluşturarak araç tiplerinine göre primleri yazdık. public void countPrim (int term) {
        switch (this.type) case ... -this.prim=term==1 ? ... ternary kullandık switch sonunda defaultda this.prim=0; kullandık
        6-Otobüs tipini ayarlama. countBusType diye bir method oluşturduk. public void countBusPrim(int term){
        kullanıdan bilgi alıp verdik. input.nextInt 'i de busType'a = yaptık. sonra switch yine. default'da this.prim=0; yine. Ve ardından Otobüs tipindeki
        boş bıraktığımız yere dönüp countBusPrim(term); ekledik.
        7- Arac constructorını çağırıp oluşturduk, Kullanıcıya bilgi verip arac.'a type ve countPrim(term)'i ekledik.
        8- Prim'in 0'dan büyük ihtimalindeki ve else'i yazdık.   0 ise hatalı giriş. if arac.prim >0 . en altına kullanıcıya yeni işlem için 1 çıkış için 0
        yazıp select kavanozuna input.nextInt assgint ettik.  iki ihtimalin sonunda da select ternaryi oluşturup isAgain'e assignt ettik.
        isAgain=select==1 ?   true : false;


 */

import java.util.Scanner;

public class AracSigortaApplication {

    public static void main(String[] args) {
        //1. uygulamayı başlatan bir method kullanacağız. Çünkü method demek, kodu tekrar tekrar kullanabilmek demektir.
        start();

    }
public static void start(){



        // 2. kullanıcıdan bilgi alma
    Scanner input = new Scanner(System.in);
    boolean isAgain;

        // 3.tekrar tekrar menü gösterilsin -do while olmalı çünkü kullanıcının kaç kere tekrar edeceğini bilmiyoruz.

    do {
        System.out.println("--- Zorunlu Araç Sigorta Primi Hesaplama Uygulaması ---");
        System.out.println("Tarife dönemi seçiniz: ");
        System.out.println("1. Haziran 2023");
        System.out.println("2. Aralık 2023");
        int term = input.nextInt();
        String termName=term==1 ? "Haziran 2023" : "Aralık 2023";

        int select;
        //tarife dönemi doğru girilirse işleme devam edeceğiz, fakat hatalı girilirse uyarı mesajı vermeliyiz ve yeni form göstermeliyiz.


        if (term==1 || term == 2) {

//7. adım arac constructorını çağırdık.
Arac arac=new Arac(); // default constructor
            System.out.println("Araç tipini giriniz : ");
            System.out.println("otomobil, kamyon, otobüs, motosiklet");
            arac.type= input.next();
            arac.countPrim(term); //prim set edildi
            //prim= 0 ise hatalı giriş yeni işlem seçeneği
            //prim>0 ise hesaplama başarılı , sonucu görüntüle
 //8.adım olarak prim'in 0'dan büyük ihtimalindeki ve else'i yazdık.
if (arac.prim>0) {
    //8.5 adım. ÖNCE else yaptık çünkü sonra burası
    System.out.println("------------------------------------");
    System.out.println("Araç tipi : "+arac.type);
    System.out.println("Tarife dönemi : " + termName);
    System.out.println("Aracınız ilgili dönem sigorta primi : " +arac.prim);
    System.out.println("------------------------------------");


    System.out.println("Yeni işlem için 1'i, ÇIKIŞ için 0'ı seçiniz : ");
    select=input.nextInt();

    isAgain=select==1 ? true : false;

} else {
    System.out.println("Hesaplama başarısız, tekrar deneyiniz.");
    System.out.println("Yeni işlem için 1'i, ÇIKIŞ için 0'ı seçiniz : ");
select=input.nextInt();

    isAgain=select==1 ? true : false;
}



        } else {    //hatalı girişte mesaj
            System.out.println("Hatalı giriş! ");
            isAgain=true;
        }

    } while (isAgain);


}





















}
