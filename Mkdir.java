import java.io.File;
import java.util.*;

public class Mkdir {
    public static void main(String[] args)
    {
        File f=new File("G:\\C_giri's tech hub\\sush");
        if(f.exists())
        {
            System.out.println("Folder already exists.");
        }
        else
        {
            boolean b=f.mkdir();
            if (b)
            {
                System.out.println("folder created successfully................");
            } else {
                System.out.println("Folder not created");
            }

        }
    }
}
