import java.util.*;
abstract class Area
{
    abstract void showArea();
}
class Circle extends Area
{
    int r;
    void setRadius(int r)
    {
        this.r=r;
    }
    void showArea()
    {
        System.out.println("Area of circle is:"+r*r*3.14);
    }
}
class Rectangle extends Area
{
    int len;
    int wid;
    void setData(int len,int wid)
    {
        this.len=len;
        this.wid=wid;
    }

    @Override
    void showArea() {
        System.out.println("Area of Rectangle:"+len*wid);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        Circle c=new Circle();
        c.setRadius(r);
        c.showArea();
        System.out.println("Enter length and width of rectangle:");
        int len=sc.nextInt();
        int wid=sc.nextInt();
        Rectangle r1=new Rectangle();
        r1.setData(len,wid);
        r1.showArea();
    }
}