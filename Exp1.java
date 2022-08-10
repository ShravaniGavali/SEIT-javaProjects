import java.io.DataInputStream;

class Exp1 {
    public static void main(String args[]) {
        Double GS, NS, BS, DA, HRA, CCA = 240.0, PF;
        String ENAME;
        int ENUMBER;
        DataInputStream in = new DataInputStream(System.in);

        try {
            System.out.println("Please enter the Employee Number:");
            ENUMBER = Integer.parseInt(in.readLine());
            System.out.println("Please enter the Employee Name:");
            ENAME = in.readLine();
            System.out.println("Please enter Basic Salary(in Rs):");
            BS = Double.parseDouble(in.readLine());

            DA = BS * 0.7;
            HRA = BS * 0.3;
            PF = BS * 0.1;
            GS = DA + HRA + PF + CCA;
            System.out.println("The gross salary(in Rs): " + GS);
            NS = GS - 100;
            System.out.println("The net salary(in Rs): " + NS);
        }

        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}