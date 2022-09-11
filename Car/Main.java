public class Main {
    public static void main(String[] args) {
        Car car1 = new Car( 1,"Lamboghini", "red",2022,1000,320);
        Car car2 = new Car(2, "Toyota"," sliver",2020, 900, 350);

        car1.start();
        car2.start();

        car1.accelerate();
        car2.accelerate();
    }
}
