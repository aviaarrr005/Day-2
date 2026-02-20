public class Constructor
{
    String Name;
    Constructor()
    {
        System.out.println("Default Constructor");
    }
    Constructor(String Name)
    {
        this();//Invoking Default to Parameterized
        this.Name = Name;
    }
    void Display()
    {
        System.out.println(Name);
    }
    public static void main(String args[])
    {
        Constructor c = new Constructor("Cristiano Ronaldo");
        c.Display();
    }
}