public class QuadraticEquation {
     private double a , b , c;
     public QuadraticEquation() {
     }
     public QuadraticEquation(double a ,double b, double c) {
         this.a = a;
         this.b = b;
         this.c = c;
     }
     public double getA() {
         return this.a;
     }
     public double getB() {
         return this.b;
     }
     public  double getC() {
         return this.c;
     }
     public double getDiscriminant() {
        return ((Math.pow(this.b,2)) - 4*this.a*this.c);
     }
     public  double  getRoot1() {

         return ( -this.b + Math.sqrt(getDiscriminant()))/2*this.a;
     }
     public double getRoot2 () {

         return (-this.b - Math.sqrt(getDiscriminant()))/2*this.a;
     }
     public void displayRoots(){
         double delta = getDiscriminant();
         if ( delta < 0) {
             System.out.println("The equation has no roots");
         } else if (delta == 0) {
             System.out.println("The equation has one roots");
             System.out.println(getRoot1());
         } else {
             System.out.println("The equation has two roots");
             System.out.println(getRoot1());
             System.out.println(getRoot2());
         }
     }


}
