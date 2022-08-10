interface Abc
{
    static final double pi = 3.14; //manifest constant
    public abstract void disp();
}

class Def
{
    int i = 22;
    void disp1()
    {
        System.out.println("In Disp1");
    }
}

class DemoInterface extends Def implements Abc
{
    public void disp()
    {
        System.out.println("In Disp");
    }
    public static void main(String[] args)
    {
        DemoInterface di = new DemoInterface();
        di.disp1();
        di.disp();

    };
}