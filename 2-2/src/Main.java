import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double [] score = new double[N];

        for(int i=0; i< N; i++){
            score[i] = scan.nextInt();
        }
        double max = score[0];
        for(int i=1; i < score.length; i++){
            if(score[i] > max){
                max = score[i];
            }
        }
        double sum =0;
        for(int i =0; i < N; i++){
            score[i] = ((score[i] / max) * 100);
            sum += score[i];
        }
        double average = sum / N;
        System.out.println(average);
        scan.close();
    }
}