import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius;
        double perimeter;
        double area;

        System.out.println("Enter the radius: ");
         radius = s.nextFloat();
        area = Math.PI * radius*radius;
        perimeter = 2 * Math.PI * radius;
        System.out.println("The Area is: "+ area);
        System.out.println("The perimeter is: " + perimeter);
    }
}
