class MethodOverload {
    int c = 0;
    double c1 = 0.0;

    public static void main(String args[]) {

        int resultint = 0;
        double resultdouble = 0.0;
        MethodOverload m1 = new MethodOverload();
        resultint = m1.add(10, 20);
        resultdouble = m1.add(10, 30.5);
        System.out.println("The result int is " + resultint);
        System.out.println("The result double is " + resultdouble);

    }

    int add(int a, int b) {
        c = a + b;
        return c;
    }

    double add(int d, double e) {
        c1 = d + e;
        return c1;
    }
}
