package MultipleExceptions;

public class program {
    public static void main(String[] args){
        int a = 5, b = 0;
        
        System.out.println(div(a, b));
    }

    public static int div(int a, int b) throws ArithmeticException {
        if(b == 0)
            throw new ArithmeticException("Division by Zero");
        else 
            return a / b;        
    }
}
