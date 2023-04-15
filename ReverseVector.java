import java.util.*;
public class ReverseVector {
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.add(5);
        v.add(3);
        v.add(9);
        v.add(4);
        v.add(1);
        int m=v.size()/2;
        int end=v.size()-1;
        for(int i=0;i<m;i++)
        {
          Object f=v.get(i);
          Object e=v.get(end);
         v.set(end,f);
         v.set(i,e);
          end--;

        }
        System.out.print("Vector after reverse\t"+v);
    }
}
