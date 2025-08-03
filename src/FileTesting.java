import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTesting {
    public static void main(String[] args ) throws IOException {
    String name  ="hobber.txt";
    File na= new File(name);
    FileWriter f2 = new FileWriter(na);
    FileWriter f3 = new FileWriter(na);
    f2.write("this is fukin creation ");
    f3.write("the creatuion can beb seeen in the third part too  ");
    f2.close();
    f3.close();

    System.out.println("open this file tio know ");
    }
    //jvm shutdown
}
