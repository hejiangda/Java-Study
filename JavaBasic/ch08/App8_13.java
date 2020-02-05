interface Face1
{
  static final double PI=3.14;
  abstract double area();
}
interface Face2
{
  abstract void volume();
}
public class App8_13 implements Face1,Face2
{
  private double radius;
  private int height;
  public App8_13(double r,int h)
  {
    radius=r;
    height=h;
  }
  public double area()
  {
    return PI*radius*radius;
  }
  public void volume()
  {
    System.out.println("圆柱体体积="+area()*height);
  }
  public static void main(String[] args) {
    Cylinder volu=new Cylinder(5.0,2);
    volu.volume();
  }
}
