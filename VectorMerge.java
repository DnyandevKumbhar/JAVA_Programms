import java.util.*;
public class VectorMerge {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        Vector v1=new Vector();
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(10);
        Vector m=new Vector();

        for(int i=0;i<v.size();i++)
        {
            Object o=v.get(i);
            m.add(o);

        }
        for(int j=0;j<v1.size();j++)
        {
            Object o1=v1.get(j);
            m.add(o1);

        }
        System.out.println("Vector after merging"+m);
    }
}
