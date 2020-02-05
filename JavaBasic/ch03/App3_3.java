import java.io.*;
public class App3_3
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader buf;
    String str;
    buf=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("请输入字符串：");
    str=buf.readLine();
    System.out.println("您输入的字符串是："+str);
  }
}
