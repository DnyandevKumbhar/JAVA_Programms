import java.util.*;
public class ArrayIndexOutOfBound {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[] {2,5,6};
        try{
            System.out.println(a[3]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Error is "+ex);
        }


    }
}
