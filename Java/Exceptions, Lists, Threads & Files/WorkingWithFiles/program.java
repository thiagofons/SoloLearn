package WorkingWithFiles;

import java.io.File;

public class program {
    public static void main(String[] args){
        File file = new File("teste.txt");
        if(file.exists())
            System.out.println(file.getName() + " exists!");
        else
            System.out.println("The file does not exists!");
    }

}
