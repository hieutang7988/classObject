import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Start");
            System.out.println("2.Stop");
            System.out.println("3. getElapsedTime");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                stopWatch.start();
                break;
                case 2 :
                    stopWatch.end();
                    break;
                case 3 :
                    System.out.println(stopWatch.getElapsedTime());
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
