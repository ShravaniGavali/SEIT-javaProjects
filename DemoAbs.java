abstract class Animal
{
    int eyes,ears,legs;
    abstract void bark();
    void eat()
    {
        System.out.println("Eating");
    }
}

class DemoAbs extends Animal
{
    void bark()
    {
        System.out.println("Barking");
    }
    void bark(int e, int er, int l)
    {
        int K,L,M;
        K = e;
        L = er;
        M = l;
        System.out.println("Eyes are:"+K+"\nEars are:"+L+"\nLegs are:"+M+"");
    }

    public static void main(String[] args)
    {
        DemoAbs ab = new DemoAbs();
        ab.eyes = 2;
        ab.ears = 2;
        ab.legs = 4;
        ab.bark();
        ab.bark(ab.eyes, ab.ears, ab.legs);
        ab.eat();
    };


}