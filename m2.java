class m2 implements Runnable
{
    public void run()
    {
        System.out.println("My thread is in running state.");
    }
    
    public static void main(String[] args)
    {
        m2 obj = new m2();
        Thread tobj = new Thread(obj);
        tobj.start();
    };
}