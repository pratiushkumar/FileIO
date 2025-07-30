import java.io.File;

public class Test {
     public static void main (String[] args) {
         //java.io pai clases are built using the standards of unix os
         //In linux/unix os there is no difference between file and directory

         String directoryname =  "Worldcup teams ";

         File f = new File(directoryname);
         System.out.println(f.exists()); //it will give false as ans

         f.mkdir();
         //this is where we created the file or directory
         System.out.println();
         System.out.println(f.exists());
     }
     //JVM SHUTDOWN HO GAYA
}
