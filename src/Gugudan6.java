import java.util.Scanner;

public class Gugudan6 {
	public static void main(String[] args) {
		System.out.println("����� axb���� a,b ���·� �Է����ּ���");
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
