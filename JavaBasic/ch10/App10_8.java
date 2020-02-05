import java.io.*;
public class App10_8{
    public static void main(String[] args) throws IOException{
        String str=new String();
        try(
            
            BufferedReader in=new BufferedReader(new FileReader("test.txt"));
            BufferedWriter out=new BufferedWriter(new FileWriter("test1.txt"));
        )
        {
            while((str=in.readLine())!=null){
                System.out.println(str);
                out.write(str);
                out.newLine();
            }
            out.flush();
        }
        catch(IOException ioe){
            System.out.println("错误！"+ioe);
        }
    }
}