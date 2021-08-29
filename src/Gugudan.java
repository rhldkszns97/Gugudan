import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner product = new Scanner(System.in);
		int number = product.nextInt();
		System.out.println("number : " + number);
		if (number < 2) {
			System.out.println("2이상 9이하의 값을 입력해야 합니다");
		}
		else if (number > 9) {
			System.out.println("2이상 9이하의 값을 입력해야 합니다");
		}
		else {
			for(int i=1; i<10; i++) 
			{
				int sum = number*i;
				System.out.println(number+"x"+i+"="+sum);
			}
				}
			}
		}
			
	
//	}
//}
	
//	int i = 1;
//	while (i < 10) {
//		int sum = number*i;
//		System.out.println(number+"x"+i+"="+sum);
//		i = i+1;