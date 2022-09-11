import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a :");
        double a = scanner.nextDouble();
        System.out.println("Enter the number b :");
        double b = scanner.nextDouble();
        System.out.println("Enter the number c :");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b,c);


      //  System.out.println("Root1 :" + quadraticEquation.getRoot1());
        //System.out.println("Root2 :" + quadraticEquation.getRoot2());
        quadraticEquation.displayRoots();
    }
}
