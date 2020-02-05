class A{
  int a=1;
}
public class App8_7{
  public static void main(String[] args) {
    A obj1=new A();
    A obj2=new A();
    String s1,s2,s3="abc",s4="abc";
    s1=new String("abc");
    s2=new String("abc");
    System.out.println("s1.equals(s2):"+(s1.equals(s2)));
    System.out.println("s1==s3:"+(s1==s3));
  }
}
