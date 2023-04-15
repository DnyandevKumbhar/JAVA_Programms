public class NullPointerExeption {
    static int a[];
    public static void main(String[] args)
    {
        try{
            a[0]=100;
            System.out.println("value is "+a[0]);
        }
        catch (NullPointerException ex)
        {
            System.out.println("Error is "+ex);
        }
    }
}
