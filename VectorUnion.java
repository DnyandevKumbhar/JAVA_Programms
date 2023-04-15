import java.util.*;
public class VectorUnion {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(8);
        v.add(2);
        v.add(5);
        v.add(3);
        v.add(4);
        Vector v1=new Vector();
        v1.add(6);
        v1.add(2);
        v1.add(8);
        v1.add(3);
        v1.add(9);
        Vector u=new Vector();
        for(int i=0;i<v.size();i++)
        {
            Object o=v.get(i);
            u.add(o);

        }
        for(int j=0;j<v1.size();j++)
        {
            Object o1=v1.get(j);
            u.add(o1);

        }
        Collections.sort(u);
        for(int k=0;k<u.size();k++) {
            Object o = u.get(k);
            Object o1 = u.get(k + 1);
            if (o == o1) {
                continue;
            }
            System.out.println(o);

        }

    }
}
