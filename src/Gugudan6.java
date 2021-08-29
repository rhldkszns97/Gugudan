import java.util.Scanner;

public class Gugudan6 {
	public static void main(String[] args) {
		System.out.println("출력할 axb단을 a,b 형태로 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		for (int i=2; i <= first; i++) {
			for (int j=1; j <= second; j++) {
				int result = i*j;
				System.out.println(i+"x"+j+"="+result);
			}
		}
	}
}
