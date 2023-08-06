import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            if ((i*2)%3==0) {
                sum += i * 2;                          
            }

        }
        System.out.println(sum);



    }
}
