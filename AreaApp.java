
import java.util.*;
interface Area1
{
    public void dimensions();
    public void area();
}
class Circle1 implements Area1
{
    int r;

    @Override
    public void dimensions() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        int r=sc.nextInt();
        this.r=r;
    }

    @Override
    public void area() {
        System.out.println("Area of circle:"+r*r*3.14);
    }
}
class Rect implements Area1
{
    int len;
    int wid;

    @Override
    public void dimensions() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width of rectangle:");
        int len=sc.nextInt();
        int wid=sc.nextInt();
        this.len=len;
        this.wid=wid;

    }

    @Override
    public void area() {
        System.out.println("Area of rectangle:"+len*wid);
    }
}
class Triangle implements Area1
{
    int base;
    int hight;

    @Override
    public void dimensions() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hight and base of traingle:");
        int base=sc.nextInt();
        int hight=sc.nextInt();
        this.base=base;
        this.hight=hight;
    }

    @Override
    public void area() {
        System.out.println("Area of traingle is:"+(hight*base)/2);
    }
}
class Square implements Area1
{
    int side;

    @Override
    public void dimensions() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of square:");
        int side=sc.nextInt();
        this.side=side;

    }

    @Override
    public void area() {
        System.out.println("Area of square is:"+side*side);
    }
}
public class AreaApp {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Area of circle.");
        System.out.println("2.Area of Rectangle.");
        System.out.println("3.Area of Traingle.");
        System.out.println("4.Area of Square.");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                Circle1 c=new Circle1();
                c.dimensions();
                c.area();
                break;
            case 2:
                Rect r1=new Rect();
                r1.dimensions();
                r1.area();
                break;
            case 3:
                Triangle t=new Triangle();
                t.dimensions();
                t.area();
                break;
            case 4:
                Square s=new Square();
                s.dimensions();
                s.area();
                break;
            default:
                System.out.println("Wrong choice...:(");
                break;
        }




    }
}
