public class App5_1
{
  public static void main(String[] args) {
    int i;
    int[] a;
    a=new int[5];
    for(i=0;i<5;i++)
      a[i]=i;
    //for(i=a.length-1;i>=0;i--)
      //System.out.print("a["+i+"] = "+a[i]+",\t");
    //System.out.println("\n 数组a的长度是："+a.length);
    for(int element:a)
      System.out.println(element);
  }
}
