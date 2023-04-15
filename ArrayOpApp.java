
    import java.util.*;
    interface ArrayOp {
        void performOp(int a[]);
    }
    class Sort implements ArrayOp
    {
        @Override
        public void performOp(int a[]) {
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        int t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
            System.out.println("Array after sorting:");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]+"\t");
            }
        }
    }
   class Insert implements ArrayOp
   {
       int index;
       int value;

      void setValue(int index,int value)
      {
          this.index=index;
          this.value=value;
      }
       @Override
       public void performOp(int[] a) {
          for(int i=4;i<=index;i--)
          {
              a[i]=a[i+1];
          }
        a[index]=value;
           System.out.println("Array after insertion:");
           for(int i=0;i<a.length;i++)
           {
               System.out.println(a[i]+"\t");
           }
       }
   }
    public class ArrayOpApp
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int[] a=new int[6];
            System.out.println("Enter values in array:");
            for(int i=0;i<a.length-1;i++)
            {
                a[i]=sc.nextInt();
            }
            Sort s=new Sort();
            s.performOp(a);
            Insert i1=new Insert();
            System.out.println("Enter index and value for insert:");
            int index=sc.nextInt();
            int value=sc.nextInt();
            i1.setValue(index,value);
            i1.performOp(a);
        }
    }

