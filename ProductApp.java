import java.util.*;
/*case 1: Add New Product( id,name,price,company)
note: collection should not accept duplicate product name and company
case 2: View All Product
case 3: count total number of Product
case 4: display company wise product count
case 5: search product by name or by company or by id or by price
case 6: delete product by company name or id or by product name
case 7: find the product details in desecending order by price
case 8: find second highest price product details
case 9 : display the company name who having maximum product count
case 10:update price of product by company name and its product name */

public class ProductApp {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       int ch;
          Repository r=null;
        do
        {
            System.out.println("1.Add new product");
            System.out.println("2.View all products");
            System.out.println("3.Count total products.");
            System.out.println("4.Display company wise product count.");
            System.out.println("5.Search product.");
            System.out.println("6.Delete product.");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter product name company name id and price");
                    String name=sc.next();
                    String company=sc.next();
                    int id=sc.nextInt();
                    int price=sc.nextInt();
                    Product_info p=new Product_info(id,name,price,company);
                     r=new Repository();
                  //  boolean b=r.isAddProduct(p);
                    if(r.verify(p))
                    {
                        System.out.println("Product already present in collection.");
                    }
                    else
                    {
                        if(r.isAddProduct(p))
                        {
                            System.out.println("Product added successfully");
                        }
                        else {
                            System.out.println("Product not added");
                        }

                    }
                    break;
                case 2:
                    ArrayList al=r.getAllProducts();
                    if(al.size()==0)
                    {
                        System.out.println("No data found");
                    }
                    else {
                        for(Object obj:al)
                        {
                            p=(Product_info) obj;
                            System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getPrice());
                        }
                    }

                    break;
                case 3:
                    System.out.println("Total number of products :"+r.getTotalCount());
                    break;
                case 4:
                    String s[]=r.getCompanyCount();
                    for(int i=0;i<s.length;i++)
                    {
                        String []s1=s[i].split(",");
                        System.out.println(s1[0]+"----->"+s1[1]);
                    }
                    break;
                case 5:
                    System.out.println("1.Search by ID of product.");
                    System.out.println("2.Search by Company of product.");
                    System.out.println("3.Search by price of product");
                    System.out.println("4.Search by Name of product");
                    System.out.println("Enter your choice: ");
                    int c=sc.nextInt();
                    switch (c)
                    {
                        case 1:
                            System.out.println("Enter ID of product");
                            int pid=sc.nextInt();
                            p=(Product_info) r.searchProductBYID(pid);
                            if(p!=null)
                            {
                                System.out.println("Product found.");
                                System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getPrice());
                            }
                            else
                            {
                                System.out.println("Product not found");
                            }
                            break;
                        case 2:
                            System.out.println("Enter name of product: ");
                            String comp=sc.next();
                            p=(Product_info) r.searchProductByCompany(comp);
                            if(p!=null)
                            {
                                System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getPrice());
                            }
                            else
                            {
                                System.out.println("No product found for this company");
                            }

                            break;
                        case 3:
                            System.out.println("Enter price of product:");
                            int pric=sc.nextInt();
                            List list=r.searchProductByPrice(pric);
                            if(list.size()>0) {


                                for (Object obj : list) {
                                    p = (Product_info) obj;
                                    System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getCompany() + "\t" + p.getPrice());
                                }
                            }
                            else
                            {
                                System.out.println("No product found for this price");
                            }
                            break;
                        case 4:
                            System.out.println("Enter product name :");
                            String pro=sc.next();
                            p=(Product_info) r.searchProductbyName(pro);
                            if(p!=null)
                            {
                                System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getPrice());
                            }
                            else {
                                System.out.println("No product is found for this name : "+pro);
                            }
                            break;
                        default:
                            System.out.println("Wrong choice..!");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("1.Delete by ID of product.");
                    System.out.println("2.Delete by price of product.");
                    System.out.println("3.Delete by Name of product");
                    System.out.println("4.Delete by company of product");
                    System.out.println("Enter your choice: ");
                    int d=sc.nextInt();
                    switch (d)
                    {
                        case 1:
                            System.out.println("Enter ID of product");
                            int prodid=sc.nextInt();
                            int ind=r.deleteByID(prodid);
                            if(ind!=-1)
                            {
                                System.out.println("Product deleted successfully.");
                            }
                            else {
                                System.out.println("Product not deleted");
                            }
                            break;
                        case 2:
                            System.out.println("Enter price of product");
                            int pr=sc.nextInt();
                            int index=r.deleteProductByPrice(pr);
                            if(index!=-1)
                            {
                                System.out.println("Product deleted successfully.");
                            }
                            else {
                                System.out.println("Product not deleted");
                            }
                            break;
                        case 3:
                            System.out.println("Enter name of product:");
                            String nm=sc.next();
                            int inde=r.deleteByName(nm);
                            if(inde!=-1)
                            {
                                System.out.println("Product deleted successfully.");

                            }
                            else {
                                System.out.println("Product not deleted");
                            }
                            break;
                        case 4:
                            System.out.println("Enter company of product:");
                            String cn=sc.next();
                            int in=r.deleteByCompany(cn);
                            if(in!=-1)
                            {
                                System.out.println("Product deleted successfully.");

                            }
                            else {
                                System.out.println("Product not deleted");
                            }
                            break;
                        default:
                            System.out.println("Wrong choice");
                            break;
                    }

                    break;
                default:
                    System.out.println("Wrong choice...!");
                    break;
            }
        }
        while (true);

    }
}
