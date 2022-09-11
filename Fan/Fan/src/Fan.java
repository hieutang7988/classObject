public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan () {
    }

    public Fan (int speed, boolean on, double radius,String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
}
