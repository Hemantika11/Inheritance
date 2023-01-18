package R.Inheritance;

public class RunTest
{
    public static void main(String[] args)
    {
        Student s=new Student();
        s.Id();
        s.Name();
        s.Address();
        s.Classname();
        s.Grade();

        System.out.println("********************************");

        Alvin a=new Alvin();
        a.Id();
        a.Name();
        a.Classname();
        a.Address();
        a.Grade();

        System.out.println("********************************");

        Hema b= new Hema();
        b.Id();
        b.Name();
        b.Address();
        b.Classname();
        b.Grade();

        System.out.println("********************************");

        Charles c=new Charles();
        c.Id();
        c.Name();
        c.Address();
        c.Classname();
        c.Grade();


        
    }
}
