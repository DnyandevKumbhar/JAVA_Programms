import java.io.File;
import java.io.IOException;
import java.util.*;

public class NewFile {
    public static void main(String[] args) throws IOException
    {
        File f=new File("G:\\C_giri's tech hub\\MKDIR\\nf.txt");

        boolean b=f.createNewFile();
        if (b)
        {
                System.out.println("file created successfully................!");
        }
        else
        {
                System.out.println("file not created");
        }


    }
}