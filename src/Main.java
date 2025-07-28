import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello, World!");
        String filename  = "abc.txt";
        File f =  new File(filename);
        System.out.println(f.exists());

        //now we will create a new java field
        f.createNewFile();
        System.out.println(f.exists());
    }
    //JVM SHUTDOWN NOW
}