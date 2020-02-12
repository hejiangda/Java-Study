public class App13_4
{
    public static void main(String[] args) {
        (
            new Inner()
            {
                void setName(String n)
                {
                    name=n;
                    System.out.println("姓名："+name);
                }
            }
        ).setName("张  华");
    }
    static class Inner
    {
        String name;
    }
}