import java.util.*;import java.io.File;

import java.io.*;
import java.io.IOException;

public class FileMenu {
    public static void main(String[] args) throws IOException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("1.Create new file.");
        System.out.println("2.Store data.");
        System.out.println("3.Copy data into another file.");
        System.out.println("4.Convert all data into uppercase.");
        System.out.println("5.Count all vowels.");
        System.out.println("6.count all words.");
        System.out.println("7.Search specific word frim file.");
        System.out.println("8.Search specific word and replace all matching words into another word.");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        File f = new File("G:\\C_giri's tech hub\\JAVA_Notes\\FH.txt");


        switch (ch) {
            case 1:
                boolean b=f.createNewFile();
                if (b)
                {
                    System.out.println("file created successfully................!");
                }
                else
                {
                    System.out.println("file not created");
                }
                break;
            case 2:
                FileWriter fw = new FileWriter(f);
                System.out.println("Enter data in file.");
                String str = sc.next();
                fw.write(str);
                fw.close();
            case 3:
                FileInputStream fi=new FileInputStream("G:\\C_giri's tech hub\\JAVA_Notes\\FH.txt");
                FileOutputStream fo=new FileOutputStream("G:\\C_giri's tech hub\\JAVA_Notes\\copy.txt");
                int dt;
                while ((dt=fi.read())!=-1)
                {
                    fo.write(dt);
                }
                fi.close();
                fo.close();
                System.out.println("Data copied sucessfully.");

                break;
            default:
                System.out.println("Wrong choice.......!");
                break;
        }
    }
}
