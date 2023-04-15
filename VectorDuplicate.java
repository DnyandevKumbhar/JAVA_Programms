import java.util.*;
public class VectorDuplicate {
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
        v.add(10);
        v.add(100);
        Collections.sort(v);
        for(int i=0;i<v.size();i++)
        {
            Object f=v.get(i);
            Object n=v.get(i+1);
            if(f==n)
            {
                v.set(i+1,-1);
                System.out.println(f);
            }
            else {
                continue;
            }
        }

    }
}
