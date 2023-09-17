package RestaurantBillGenerator.Practice;

// POJO Classı- En temel Classtır. Daha sonra kalıcı hale getirmek istediğimiz dataları barındırırız içinde.
// Fieldlar - Constructorları - Getter Setterlar ve ToStringler.
    //3- Yiyecek objesi
    public class DishP {

    // yiyeceklerin özellikleri okunsun fakat daha sonra değiştirilemesin.
    private int code;
    private String name;
    private double price;

    // yiyecekleri oluştururken fieldlar set edilsin


        public DishP(int code, String name, double price) {
            this.code = code;
            this.name = name;
            this.price = price;

        }
        // getter methodlar
        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        //toString - Classta oluşturduğumuz objenin field isimlerini ve değerlerini String bir ifadeye dönüştürmek için kullanırız.
        // Artık bir objeyi obje olasına rağmen sout ile yazdırabiliyoruz.
        @Override
        public String toString() {
            return
                    "code=" + code +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }



    }
