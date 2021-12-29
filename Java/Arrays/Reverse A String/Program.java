import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
        
        int size = arr.length;
        for(int i = size - 1; i >= 0; i--)
            System.out.printf("%c", arr[i]);
        
        scanner.close();		
	}    
}