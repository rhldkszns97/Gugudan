import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		System.out.println("출력할 구구단 단을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number < 2) {
			System.out.println("2이상 9이하의 수를 입력하세요");
		}
		else if(number >9) {
			System.out.println("2이상 9이하의 수를 입력하세요");
		}
		else {
			int[] result = new int[9];
			for(int i=0; i < result.length; i++) {
				result[i] = number*(i+1);
				System.out.println(number+"x"+(i+1)+"="+result[i]);
			}
		}
	}
}
