package biletRezervasyonApp;

public class Ticket {

    //4- mesafe(km), koltuk numarası,yolculuk tipi

    public double distance;
    public int typeNo;
    public String seatNo;
    private double price;    //verilen bilgilere göre hesaplayacağız. prive olabilir çünkü bu classta kullanacağız

    //5- bilet fiyatını hesaplama
    public void getTotalPrice (int age){
        double total =0;
        int seat=Integer.parseInt(this.seatNo);     //String'i integera çeviriyor.
        switch (this.typeNo) {
            case 1: //tek yön
                if (seat%3==0) {
                    total=this.distance*1.2;
                } else {

                    total=this.distance*1;
                }
                System.out.println("Toplam tutar : " + total);
                break;
            case 2: //çift yön

                if (seat%3==0){
                      total=this.distance*2.4;

                } else {
                    total=this.distance*2;

                }
                System.out.println("Toplam tutar : " + total); //100
                //çift yön indirimi
                total=total*0.8;
                System.out.println("Çift yön indirimli Toplam tutar : " +total); //80
                break;
              // default yok çünkü önceden kontrol edilecek.

             //son tutardan yaş indirimi
        }
            if (age<12){
                total=total*0.5;
                System.out.println("Yaş indirimli Toplam tutar : " +total); //50
            } else if (age>65){
                total=total*0.7;
                System.out.println("65 yaş üstü indirimli Toplam tutar : " +total); //70
            }
        this.price=total;


    }

    // 6- Bileti yazdıracağız
public void printTicket (Bus bus) {

    System.out.println("*".repeat(42));
    System.out.println(" --- Bilet Detayı ----");
    System.out.println("Otobüs plakası     :" + bus.numberPlate);
    System.out.println("Mesafe         :" + this.distance);
    System.out.println("Yolculuk Tipi   :" + (this.typeNo == 1 ? "Tek yön" : "Gidiş dönüş"));
    System.out.println("Koltuk no         :" + this.seatNo);
    System.out.println("Toplam Tutar      :" + this.price);
    System.out.println("Keyifli yolculuklar dileriz");
    System.out.println("*".repeat(42));


}







}
