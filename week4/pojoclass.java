package week4;

public class Car {
    private String brand;
    private int year;
    private int price;
    private String country;

    public Car(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    public Car(String brand, int year,int price,String country){
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.country = country;

    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        if(price > 0)
            this.price = price;
        else
            System.out.println("Price can not be less than 0");
    }
    public int getYear(){
        return this.price;
    }
    public void setYear(int year){
        if(year > 0)
            this.year = year;
        else
            System.out.println("Year can not be less than 0");
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String args[]) {
        Car car1 = new Car("Toyota",15000);
        car1.setYear(2018);
        car1.setCountry("Japan");
        System.out.println(car1);

    }
}
