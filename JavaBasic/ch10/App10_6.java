import java.io.*;
public class App10_6{
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("test.txt");
        char[] c={'H','e','l','l','o','\n'};
        String str="欢迎使用Java！";
        fw.write(c);
        fw.write(str);
        fw.close();
    }
}