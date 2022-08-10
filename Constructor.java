class Constructor {

    static String msg = "";

    Constructor() //is a pure Constructor
    {
        msg = "Hello, this is a pure CONSTRUCTOR";
    }

    Constructor(String str) // Overloaded Constructor
    {
        System.out.println("This is Overloaded Constructor: " + str);
    }

    void Constructor() // Method
    {
        System.out.println("This is a simple Method");
    }

    void Constructor(String str2) // Overloaded Method
    {
        System.out.println("This is Overloaded Method: " + str2);
    }

    public static void main(String args[]) {
        // System.out.println("Hello World!");
        new Constructor();
        new Constructor("Yess Overloaded Constructor");

        Constructor c1 = new Constructor();
        c1.Constructor();
        c1.Constructor("Yess Overloaded Method");

        System.out.println("In message: " + msg);
    }

}