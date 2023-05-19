package Main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		// 입력받은 문자열을 " "로 구분하고 토큰화여 int형으로 자료형 변환 후 변수에 저장 
		StringTokenizer token = new StringTokenizer(input);
		int num1 = Integer.parseInt(token.nextToken());
		int num2 = Integer.parseInt(token.nextToken());
		int num3 = Integer.parseInt(token.nextToken());
		
		// 3개의 주사위의 눈금이 모두 같을 때
		if(num1 == num2 && num1 == num3) {
			System.out.println(10000+ num1*1000);
		}
		// 2개의 주사위 눈금이 같을 때
		else if(num1 == num2 || num1==num3 || num2 == num3) {
			int a = num1 == num2 ? num1 : num3;
			System.out.println(1000+a*100);
		}
		// 3개의 주사위 눈이 하나도 같지 않을 때
		else {
			int max = Math.max(Math.max(num1,num2), num3);
			System.out.println(max*100);
		}
		scan.close();
	}
}
/*
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.

입력 : 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
*/