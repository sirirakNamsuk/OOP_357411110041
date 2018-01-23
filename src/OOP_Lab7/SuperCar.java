package OOP_Lab7;
//SuperCar
// 1.car brand
// 2.car color
// 3.car enging size
// 4.max speed
// 5.county of origin

public class SuperCar {
    public boolean gender;

    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ",speed='" + speed + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
    private static String getder = "Car";
    private String brand;
    private String color;
    private String size;
    private String speed;
    private String county;
    //Constructor
    //Default contructor
    public SuperCar(){}
    //create constructor by owner
    public SuperCar (String brand,String color,String size,String speed,
                     String county){
        //asigne data to class properties
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.speed = speed;
        this.county = county;
    }
    //getter and setter methods


    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getsize() {
        return size;
    }

    public void setsize(String size) {
        this.size = size;
    }

    public String getspeed() {
        return speed;
    }

    public void setspeed(String speed) {
        this.speed = speed;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}//class
