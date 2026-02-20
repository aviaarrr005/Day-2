
public class Avengers
{
    String Name;
    Avengers(String Name)
    {
        this.Name = Name;
    }
    void Display()
    {
        System.out.println(Name);
    }
    public static void main(String args[])
    {
        Avengers ob = new Avengers("Spider Man");
        ob.Display();
    }
}