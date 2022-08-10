import java.util.Vector;

class VectorDemo
{
    public static void main(String args[])
    {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        Vector v3 = new Vector();

        try {
                v1.add("Pencils");
                v1.add(10);
                v1.add(5.0);

                v2.add("Notebook");
                v2.add(100);
                v2.add(15.0);

                v1.add(3,"Stationary");
                v2.add(2,"Type of Writers");

                System.out.println("First Vector:"+v1);
                System.out.println("First Vector First Element:"+v1.get(0));
                System.out.println("First Vector Element:"+v1.elementAt(3));

                System.out.println("Second Vector:"+v2);

                if(v3.isEmpty())
                {
                        v3.add("Mahesh");
                }

                System.out.println("Third Vector:"+v3);

                System.out.println("Size: "+v1.size());
                System.out.println("Capacity: "+v1.capacity());

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error: "+e);
        }
    }
}