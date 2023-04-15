import java.util.ArrayList;
import java.util.*;
public class ArrayListMenu {
    public static void main(String[] args)
    {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(400);
        a.add(50);
        a.add(200);
        a.add(70);
        a.add(80);
        a.add(9);
        a.add(100);
        do {

        System.out.println("1.Insert value at specific index");
        System.out.println("2.Show all data");
        System.out.println("3.Search specific value");
        System.out.println("4.Delete value at specific index");
        System.out.println("5.Sort value in ascending order");
        System.out.println("6.Sort values in descending order");
        System.out.println("7.Find max value");
        System.out.println("8.Find min value");
        System.out.println("Enter your choice");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        switch (c)
        {
            case 1:
                System.out.println("Enter index and value:");
                int ind=sc.nextInt();
                int v=sc.nextInt();
                a.add(ind,v);
            break;
            case 2:
                System.out.println(a);
                break;
            case 3:
                System.out.println("Enter value for search:");
                int val=sc.nextInt();
                int index=a.indexOf(val);
                if(index!=-1)
                {
                    System.out.println("Value found");  //v.remove(val);
                }
                else
                {
                    System.out.println("Value not found");
                }
                break;
            case 4:
                System.out.println("Enter index for delete:");
                int inx=sc.nextInt();
                a.remove(inx);
                break;
            case 5:
                Collections.sort(a);
                System.out.println("Values after ascending oder"+a);

                break;
            case 6:
                for(int i=0;i<a.size();i++)
                {
                    for(int j=i+1;j<a.size();j++)
                    {
                        Object p=a.get(i);
                        Object n=a.get(j);
                        if((int)p<(int)n)
                        {
                            a.set(i,n);
                            a.set(j,p);
                        }
                    }

                }
                System.out.println("Values after descending oder"+a);
                break;
            case 7:
                int max=(int)a.get(0);
               for(int i=0;i<a.size();i++)
                {
                    if(max<(int)a.get(i))
                    {
                        max=(int)a.get(i);
                    }
                }
                System.out.println("Maximum element: "+max);
                break;
            case 8:
                int min=(int)a.get(0);
                for(int i=0;i<a.size();i++)
                {
                    if(min>(int)a.get(i))
                    {
                        min=(int)a.get(i);
                    }
                }
                System.out.println("Maximum element: "+min);
                break;
            default:
                break;
        }


        }while(true);

    }
}
