import java.util.*;
class VoterEx extends ArithmeticException
{
    public String getError()
    {
        return "you cannot vote";
    }
}
class VoterVerify
{
    void verifyAge(int age)
    {
        if(age<18)
        {
            VoterEx ve=new VoterEx();
            throw ve;
        }
        else {
            System.out.println("You can vote");
        }
    }
}
public class VoterApp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        try
        {
            VoterVerify v=new VoterVerify();
            v.verifyAge(age);
        }
        catch(VoterEx ex)
        {
            System.out.println(ex.getError());
        }

    }
}
