import java.util.Scanner;

interface MissingArrayElement
{
    public void findMissingElement(int a[]);
}
class MissingElArray implements MissingArrayElement
{
    @Override
    public void findMissingElement(int a[]) {
    for(int i=0;i<a.length;i++)
    {
        int diff=a[i+1]=a[i];
        if(diff>1)
        {
            for(int j=a[i];j<(a[i+1])-1;j++)
            {
                System.out.println(j);
            }
        }
    }

    }
}
public class MissEleArr {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter value in array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        MissingElArray m=new MissingElArray();
        m.findMissingElement(a);
    }
}
