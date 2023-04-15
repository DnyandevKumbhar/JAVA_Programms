public class StringIndexOutOfBound {
    public static void main(String[] args)
    {
        String s="Vijay";
        try{
            char ch=s.charAt(5);
            System.out.println(ch);
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println("Error is "+ex);
        }
    }
}
