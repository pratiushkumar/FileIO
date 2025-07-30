import java.io.File;
import java.io.IOException;

public class Test2 {
     public static void main(String[] args) throws IOException {
         File fo = new File("this is command  ");
         fo.mkdir();
         System.out.println("Is f pointing to a directory "+fo.isDirectory());

         File f1  = new File(fo,"abc.txt");
         fo.createNewFile();
         System.out.println("f is not pointing to a directory but rather than a file  "+ f1.isFile());
     }
}
