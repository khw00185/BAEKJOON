import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int reverseX = reverse(x);
        int reverseY = reverse(y);

        int result = Math.max(reverseX, reverseY);

        System.out.println(result);
        sc.close();
    }

    private static int reverse(int num){
        String number = String.valueOf(num);
        String reverseNum = new StringBuilder(number).reverse().toString();
        return Integer.parseInt(reverseNum);
    }
}