@FunctionalInterface
interface IShow<T>
{
    public T create(String s,int a);
}
class Person
{
    String name;
    int age;
    Person()
    {
        name="刘洋";
        age=30;
    }
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return "姓名："+this.name+"，年龄："+this.age;
    }
}
public class App13_11
{
    public static void main(String[] args) {
        IShow<Person>na=Person::new;
        Person p=na.create("陈磊",32);
        System.out.println(p.toString());
    }
}