import java.util.*;
interface StringOperation
{
    public void setString(String str);
    public void performOp();
}
class CountSpace implements StringOperation
{
    String str;
    @Override
    public void setString(String str) {

         this.str=str;
    }

    @Override
    public void performOp() {
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            
            if(ch[i]==' ')
            {
                count++;
            }
        }
        System.out.println("Count of spaces in string: "+count);

    }
}
class MajorityString implements StringOperation
{
    String str;
    @Override
    public void setString(String str) {
        this.str=str;
    }

    @Override
    public void performOp() {
        char ch[]=str.toCharArray();
        int count=1;
        //int m=(ch.length)/2;
        for(int i=0;i<ch.length;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]>ch[j])
                {
                    char t=ch[i];
                    ch[i]=ch[j];
                    ch[j]=t;
                }
            }
        }
        int max=1;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==ch[i+1])
            {
                count++;
            }
            else {
                if(count>max)
                {
                    max=count;
                    System.out.println("Majority of string is :"+ch[i]);
                    count=1;

                }

            }

        }

    }
}

public class StringOp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in string");
        String str=sc.nextLine();
        CountSpace c=new CountSpace();
        c.setString(str);
        c.performOp();
        MajorityString m=new MajorityString();
        m.setString(str);
        m.performOp();
    }
}
