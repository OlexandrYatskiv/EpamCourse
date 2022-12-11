public class Human {

    protected String name, surname;
    protected int age, weight, height;

Human(String name, String surname, int age, int weight, int height)
{
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.weight= weight;
    this.height = height;
}
public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name = name;
}
public void setWeight(int weight)
{
    this.weight = weight;
}
public String getSurname()
{
        return name;
}
public void setSurname(String surname)
{
    this.surname = surname;
}
public int getAge()
{
    return age;
}

    public void setAge(int age)
    {
        this.age = age;
    }

public int  getWeight()
    {
        return weight;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }



    public String toString()
    {
        return "\nname: " + name + "\nsurname: " + surname + "\nage: " + age +"\nweight " + weight + "\nheight: " + height ;
    }
}


