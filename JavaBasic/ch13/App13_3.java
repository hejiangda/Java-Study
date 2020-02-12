public class App13_3
{
    private int age;
    
    public class Student
    {
        String name;
        public Student(String n,int a)
        {
            name=n;
            age=a;
        }
        public void output()
        {
            System.out.println("姓名："+this.name+"年龄："+age);
        }
    }
    public void output()
    {
        Student stu=new Student("刘  洋",24);
        stu.output();
    }
    public static void main(String[] args)
    {
        App13_3 g=new App13_3();
        g.output();
    }
}