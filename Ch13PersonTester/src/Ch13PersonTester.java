
public class Ch13PersonTester 
{

    
    public static void main(String[] args) 
    {
//        Person myPerson = new Person("Joe", "Green");
//        System.out.println(myPerson);        
        Employee myEmployee = new Employee("E1234", "Ethan", "Blue");
        
        System.out.println(myEmployee);
    }
    
}
class Employee extends Person
{
    String empID;
    
    public Employee(String eID, String pName, String pColor)
    {
        super(pName, pColor);
        this.empID = eID;
    }
    @Override
    public String getID()
    {
        return this.empID;
    }
    @Override
    public String toString()
    {
        return super.toString() + " ID - " + getID();
    }
}
abstract class Person
{
    String personName;
    String favColor;
    
    public Person(String pName, String pColor)
    {
        this.personName = pName;
        this.favColor = pColor;
    }
    abstract public String getID();
    
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
