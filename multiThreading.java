class multiThreading extends Thread
{
    public void run()
    {
        System.out.println("My thread is in running state.");
    }
    
    public static void main(String[] args)
    {
        multiThreading obj = new multiThreading();
        obj.start();
    };
}