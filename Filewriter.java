import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.*;
public class Filewriter {
    public static void main(String[] args) throws IOException
    {
        File f=new File("G:\\C_giri's tech hub\\MKDIR\\nf.txt");
        FileWriter fw=new FileWriter(f);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data in file.");
        String str=sc.nextLine();
        fw.write(str);
        fw.close();

    }
}
