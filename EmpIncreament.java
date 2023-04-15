import java.util.*;
interface Employee
{
    void setEmp(int id,String name,int salary);
    void validateEmp();
}
class ITEmp implements Employee
{
    int id;
    String name;
    int salary;

    @java.lang.Override
    public void setEmp(int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @java.lang.Override
    public void validateEmp() {
        if(salary==10000)
        {
            salary=salary+(salary*10)/100;
        }
        else if (salary>30000)
        {
            salary=salary+(salary*12)/100;
        }
        else if (salary<10000)
        {
            salary=salary+(salary*15)/100;
        }
        System.out.println("IT employee salary after increament :"+salary);
    }
}

public class EmpIncreament {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter IT employee ID salary and name");
        String name=sc.nextLine();
        int id= sc.nextInt();
        int sal=sc.nextInt();
        ITEmp e=new ITEmp();
        e.setEmp(id,name,sal);
        e.validateEmp();

    }
}