import java.util.*;
public class ArrayListDemo 
{   
    public static void main(String[] args)
    {
        List <String> l = new ArrayList<String>();

        l.add("Mango");
        l.add("Banana");
        l.add("Apple");
        l.add("Orange");

        System.out.println("Before Reversing");
        System.out.println(l.toString());

        Collections.reverse(l);
        System.out.println("After Reversing");
        System.out.println(l);

    };
    
}
