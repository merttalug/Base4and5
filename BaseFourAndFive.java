import java.util.Scanner;
public class BaseFourAndFive {
    public static void main(String[] args) {
        int n;
        Scanner inp =new Scanner(System.in);
        System.out.println("Please enter the limit number: ");
        n=inp.nextInt();
        System.out.println("Numbers to the power of 4 that are smaller than the number you entered as the limit, "+n+": ");
        for (int i =1; i<=n; i*=4){
            System.out.println(i);
        }

        System.out.println("Numbers to the power of 5 that are smaller than the number you entered as the limit, "+n+": ");
        for (int i =1; i<=n; i*=5){
            System.out.println(i);
        }

    }
}
