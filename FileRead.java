import java.io.*;
import java.io.IOException;
import java.io.File;

public class FileRead {
    public static void main(String[] args)throws IOException,InterruptedException
    {   FileReader fr = new FileReader("G:\\C_giri's tech hub\\JAVA_Notes\\FH.txt");
        int data;
        while((data=fr.read())!=-1) {
            System.out.print((char)data);
            //	Thread.sleep(1000);
        }
    }
}
