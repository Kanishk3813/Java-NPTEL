import java.util.Scanner;

public class myArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myArray[][][] = new int[4][5][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    myArray[i][j][k] = i * j * k;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++)
                    System.out.print(myArray[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
