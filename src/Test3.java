import java.io.File;

public class Test3 {
     public static void main(String[] args) throws Exception{
         String location   = "c:\\pwskills";
         File foo =  new File(location);
         foo.mkdir();
         File f10 = new File(foo,"java.txt");
         f10.createNewFile();
         System.out.println(f10);
         System.out.println(foo);

     }
      //JVM shutdown now----------------->>>>>>>>
}
