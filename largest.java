import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        System.out.println("first number: " + x);
        System.out.println("second number: " + y);
        System.out.println("third number: " + z);

         if (x>y && x>z){
             System.out.println("Largest number is: " + x);
         }
         else if(y>x && y>z){
             System.out.println("Largest number is: " + y);
         }
         else{
             System.out.println("Largest number is: " + z);
         }

    }
}
