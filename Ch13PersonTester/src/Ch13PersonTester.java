
public class Ch13PersonTester 
{

    
    public static void main(String[] args) 
    {
        Person myPerson = new Person("Joe", "Green");
        System.out.println(myPerson);
    }
    
}
class Person
{
    String personName;
    String favColor;
    
    public Person(String pName, String pColor)
    {
        this.personName = pName;
        this.favColor = pColor;
    }
    
    public void setFavColor(String pColor) 
    {
        this.favColor = pColor;
    }
    @Override
    public String toString()
    {
        return "Name - " + this.personName + " Color - " + this.favColor;
    }
}