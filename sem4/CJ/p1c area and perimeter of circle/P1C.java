import java.util.Scanner;


public class P1C {
    public static void main(String[] args) {
        double radius;
        double area;
        double circumference;
        final double PI = 3.14f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
        
        area = PI * radius * radius;
        circumference = 2 * PI * radius;
        
        System.out.printf("Area of Circle is %.2f\n", area);
        System.out.printf("Circumference of Circle is %.2f\n", circumference);
    }
}