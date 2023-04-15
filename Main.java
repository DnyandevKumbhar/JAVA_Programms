
import java.io.File;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        File f[]=File.listRoots();
        System.out.println("Drive\tTotalSpace\tFreeSpace");
        for(int i=0;i<f.length;i++)
        {
            long tp=f[i].getTotalSpace();
            long fp=f[i].getFreeSpace();
            System.out.println(f[i]+"\t\t"+(tp/1073741824)+"GB\t"+(fp/1073741824)+"GB");
        }

    }
}