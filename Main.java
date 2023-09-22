import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public void run() throws IOException {
        Stack<Integer> list = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for(int i=0; i< number; i++){
            String[] split = br.readLine().split(" ");

            if(split[0].equals("push")){
                list.push(Integer.parseInt(split[1]));
            }
            else if(split[0].equals("pop")){
                if(list.isEmpty()){
                    System.out.println("-1");
                }
                else
                    System.out.println(list.pop());
            }
            else if(split[0].equals("size")){
                System.out.println(list.size());
            }
            else if(split[0].equals("empty")){
                if(list.isEmpty()){
                    System.out.println("1");
                }
                else
                    System.out.println("0");
            }
            else if(split[0].equals("top")){
                if(list.isEmpty()){
                    System.out.println("-1");
                }
                else
                    System.out.println(list.peek());
            }
        }
        br.close();
    }
    public static void main(String[] args) throws Exception {
        Main M = new Main();
        M.run();
    }
}