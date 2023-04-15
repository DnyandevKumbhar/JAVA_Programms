import java.util.*;

public class Repository {
    static ArrayList al=new ArrayList();
    public boolean isAddProduct(Product_info p)
    {
        return al.add(p);

    }
    public boolean verify(Product_info p)
    {
        boolean b=false;
        if(al.size()>0)
        {
            for(Object obj:al)
            {
                Product_info p1=(Product_info) obj;
                if(p1.getName().equals(p.getName()) && p1.getCompany().equals(p.getCompany()))
                {
                    b=true;
                    break;
                }
            }
        }
        else {
            b=false;
        }
        return b;
    }
    public ArrayList getAllProducts()
    {
        return al;
    }
    public int getTotalCount()
    {
        return al.size();
    }
    public String [] getCompanyCount()
    {
        ArrayList temp=new ArrayList();
        Product_info p=(Product_info)al.get(0);
        temp.add(p.getCompany());
       // boolean b=temp.contains(p.getCompany());

        for(int i=0;i<al.size();i++)
        {
           p=(Product_info)al.get(i);
           if(temp.contains(p.getCompany()))
           {
               continue;
           }
           else
           {
               temp.add(p.getCompany());
           }
        }
        System.out.println("Display company names");
        String str[]=new String[temp.size()];
        for(int i=0;i<temp.size();i++)
        {
            int count=0;
            for(int j=i;j<al.size();j++)
            {
                p=(Product_info)al.get(j);
                if(temp.get(i).toString().equals(p.getCompany()))
                {
                    ++count;
                }
            }
            str[i]=temp.get(i).toString()+","+count;
        }
        return str;
    }
    public Product_info searchProductBYID(int id)
    {
        Product_info p=null;
        boolean b=false;
        for(Object obj:al)
        {
           // Product_info p=(Product_info) al.get(i);
            p=(Product_info)obj;
            if(id==p.getId())
            {
                b=true;
                break;
            }
        }
        return b? p:null;
    }
    public Product_info searchProductByCompany(String comp)
    {
        Product_info p=null;
        boolean b=false;
        for (Object obj:al)
        {
            p=(Product_info) obj;
            if(comp.equals(p.getCompany()))
            {
                b=true;
                break;
            }
        }
        return b?p:null;
    }
    public List searchProductByPrice(int price)
    {

        List list=new ArrayList();
        for (Object obj:al)
        {
            Product_info p=(Product_info) obj;
            if(price==p.getPrice())
            {
                list.add(p);
            }
        }
        return list;
    }
    public Product_info searchProductbyName(String pro)
    {
        Product_info p=null;
        boolean b= false;
        for(Object obj:al)
        {
            p=(Product_info) obj;
            if(pro.equals(p.getName()))
            {
                b=true;
                break;
            }
        }
        return b?p:null;
    }
    public int deleteByID(int id)
    {
        boolean b=false;
        Product_info p=null;
        for(Object ob:al)
        {
            p=(Product_info) ob;
            if(p.getId()==id)
            {
                b=true;
                break;
            }
        }
        if(b)
        {
            int ind=al.indexOf(p);
            if(ind!=-1)
            {
                al.remove(ind);
            }
            return ind!=-1 ? ind :-1;
        }
        return -1;
    }
    public int deleteProductByPrice(int price)
    {
        boolean b=false;
        Product_info p=null;
        for(Object obj:al)
        {
            p=(Product_info) obj;
            if(price==p.getPrice())
            {
                b=true;
                break;
            }
        }
        if(b)
        {
            int ind=al.indexOf(p);
            if(ind!=-1)
            {
                al.remove(ind);
            }
            return ind!=-1 ? ind :-1;
        }
        return -1;
    }
    public int deleteByName(String name)
    {
        boolean b=false;
        Product_info p=null;
        for(Object obj:al){
            p=(Product_info) obj;
            if(name.equals(p.getName()))
            {
                b=true;
                break;
            }
        }
        if(b)
        {
            int ind=al.indexOf(p);
            if(ind!=-1)
            {
                al.remove(ind);
            }
            return ind!=-1?ind:-1;
        }
        return -1;
    }
    public int deleteByCompany(String cname)
    {
        boolean b=false;
        Product_info p=null;
        for(Object obj:al){
            p=(Product_info) obj;
            if(cname.equals(p.getCompany()))
            {
                b=true;
                break;
            }
        }
        if(b)
        {
            int ind=al.indexOf(p);
            if(ind!=-1)
            {
                al.remove(ind);
            }
            return ind!=-1?ind:-1;
        }
        return -1;
    }

}
