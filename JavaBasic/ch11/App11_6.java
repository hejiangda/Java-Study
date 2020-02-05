class Mbank
{
    private static int sum=2000;
    public static void take(int k)
    {
        int temp=sum;
        temp-=k;
        try{Thread.sleep((int)(1000*Math.random()));}
        catch(InterruptedException e){}
        sum=temp;
        System.out.print("sum="+sum+'\n');
    }
}
class Customer extends Thread{
    public void run(){
        for(int i=1;i<=4;i++)
            Mbank.take(100);
    }
}
public class App11_6{
    public static void main(String[] args) {
        Customer c1=new Customer();
        Customer c2=new Customer();
        c1.start();
        c2.start();
    }
}