import java.util.*;
public class VectorOccurence {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(10);
        v.add(20);
        v.add(10);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(50);
        v.add(80);
        v.add(90);
        v.add(10);
        int count;
        for(int i=0;i<v.size();i++)
        {
            count=1;
            if((int)v.get(i)==-1)
            {
                continue;
            }
            for(int j=i+1;j<v.size();j++)
            {
                if((int)v.get(i)==(int)v.get(j))
                {
                    count++;
                    v.set(j,-1);
                }

            }
            System.out.println("Element "+v.get(i)+" Ocurred "+count+ "times.");
        }
    }
}
