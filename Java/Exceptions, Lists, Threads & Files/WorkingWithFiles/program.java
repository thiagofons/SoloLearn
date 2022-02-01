package WorkingWithFiles;

import java.io.File;
import java.io.IOException;;

public class program {
    public static void main(String[] args){
        File file = new File("test.txt");
        try{
            if(file.createNewFile())
                System.out.println(file.getName() + " exists!");
            else
                System.out.println("The file does not exists!");
        }
        catch(IOException e){
            System.out.println("An error ocurred");
            e.printStackTrace();
        }
    }
}
