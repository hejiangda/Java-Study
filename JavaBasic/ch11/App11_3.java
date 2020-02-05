class MyThread extends Thread
{
    private String who;
    public MyThread(String str)
    {
        who=str;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
                sleep((int)(1000*Math.random()));
            }
            catch(InterruptedException e){

            }
            System.out.println(who+"正在运行！！");
        }
    }
}
public class App11_3{
    public static void main(String[] args) {
        MyThread you= new MyThread("你");
        MyThread she= new MyThread("她");
        you.start();
        try{
            you.join();
        }
        catch(InterruptedException e){}
        she.start();
        try{
            she.join();
        }
        catch(InterruptedException e){}
        System.out.println("主方法 main()运行结束");
    }
}