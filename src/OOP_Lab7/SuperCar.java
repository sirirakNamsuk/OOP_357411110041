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
                "car_brand='" + car_brand + '\'' +
                ", car_color='" + car_color + '\'' +
                ", enging_size='" + enging_size + '\'' +
                ", max_speed='" + max_speed + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
    private static String getder = "Car";
    private String car_brand;
    private String car_color;
    private String enging_size;
    private String max_speed;
    private String county;
    //Constructor
    //Default contructor
    public SuperCar(){}
    //create constructor by owner
    public SuperCar (String car_brand,String car_color,String enging_size,String max_speed,
                     String county){
        //asigne data to class properties
        this.car_brand = car_brand;
        this.car_color = car_color;
        this.enging_size = enging_size;
        this.max_speed = max_speed;
        this.county = county;
    }
    //getter and setter methods


    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_color() {
        return car_color;
    }

    public void setCar_color(String car_color) {
        this.car_color = car_color;
    }

    public String getEnging_size() {
        return enging_size;
    }

    public void setEnging_size(String enging_size) {
        this.enging_size = enging_size;
    }

    public String getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(String max_speed) {
        this.max_speed = max_speed;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}//class
