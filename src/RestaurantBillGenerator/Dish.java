package RestaurantBillGenerator;

public class Dish {
    //yiyeceklerin özelliklerini okunsun fakat daha sonra değiştirelemesin

    private int code;
    private String name;
    private double price;

    //yiyecekleri oluştururken fieldlar set edilsin
    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    //getter metodları

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

        //toString

    @Override
    public String toString() {
        return
                "code=" + code +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        '}';
    }


}
