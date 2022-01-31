package RuntimeVsCheckedExceptions;

/*
Checked exceptions = checked when compiled
Unchecked exceptions = checked at runtime
*/
public class program {
    public static void main(String[] args){
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e){
            System.out.println("Error");
        }

    }
}
