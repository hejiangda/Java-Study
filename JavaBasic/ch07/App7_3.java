class Cylinder
{
  private double radius;
  private int height;
  private double pi=3.14;
  private String color;
  public double setCylinder(double r,int h)
  {
    radius=r;
    height=h;
    return r+h;
  }
  public void setCylinder(String str)
  {
    color=str;
  }
  public void show()
  {
    System.out.println("圆柱的颜色为："+color);
  }
  double area()
  {
    return pi*radius*radius;
  }
  double volume()
  {
    return area()*height;
  }
}
public class App7_3
{
  public static void main(String[] args) {
    double r_h;
    Cylinder volu=new Cylinder();
    r_h=volu.setCylinder(2.5,5);
    volu.setCylinder("红色");
    System.out.println("圆柱底半径与高之和="+r_h);
    System.out.println("圆柱体体积="+volu.volume());
    volu.show();
  }
}
