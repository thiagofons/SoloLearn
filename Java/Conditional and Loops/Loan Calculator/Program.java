import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();
		
        for(int i = 0; i < 3; i++){
            amount *= 0.9;
        }
        System.out.printf("%.0f%n", amount);
        
        scanner.close();
	}
}