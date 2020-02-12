class GeneralType<T extends Number>
{
    T obj;
    public GeneralType(T obj)
    {
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
}
public class App12_4
{
    public static void main(String[] args) {
        GeneralType<Integer> num=new GeneralType<Integer>(5);
        System.out.println("给出的参数是："+num.getObj());
        
    }
}