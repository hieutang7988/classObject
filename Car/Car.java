public class Car {
    public int id;
    public String made;
    public String color;
    public int year;
    public int engine;
    public int maxSpeed;

    public Car() {
        System.out.println("Đối tượng được tạo ra :");
    }

    public Car(int id, String made, String color ,int year, int engine, int maxSpeed) {
        this.id = id;
        this.made = made;
        this.color = color;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public  void start() {
        System.out.println("Car" + id + "start");
    }
    public void accelerate() {
        System.out.println("Car" + id + "accelerate");
    }
    public  void turnLeft () {
        System.out.println("Car" + id + "turnLeft");
    }
    public void turnRight () {
        System.out.println("Car" + id + "turnRight");
    }
    public  void stop () {
        System.out.println("Car" + id + "stopped ");
    }
    public void goStraight () {
        System.out.println("Car" + id + "goStraight");
    }

}
