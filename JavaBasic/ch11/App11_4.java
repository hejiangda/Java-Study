class ThreadSale extends Thread{
    private int tickets=10;
    public void run(){
        while(true){
            if(tickets>0)
                System.out.println(this.getName()+" 售机票第"+tickets-- +"号");
            else
                System.exit(0);
        }
    }
}

public class App11_4{
    public static void main(String[] args) {
        ThreadSale t1=new ThreadSale();
        ThreadSale t2=new ThreadSale();
        ThreadSale t3=new ThreadSale();
        t1.start();
        t2.start();
        t3.start();
    }
}