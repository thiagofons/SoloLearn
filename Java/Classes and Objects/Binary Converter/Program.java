import java.util.*;

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));

        sc.close();
    }
}

public class Converter{
    public static String toBinary(int x){
        String binary = "";
        int num = x;

        while(num > 0){
            binary = binary + (num%2);
            num /= 2;
        }
        binary = reverse(binary);

        return binary;
    }

    public static String reverse(String b){
        String nstr = "";
        char ch;

        for(int i = 0; i < b.length(); i++){
            ch = b.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
}