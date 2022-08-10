import java.io.DataInputStream;

class Bank {
    
    DataInputStream in1 = new DataInputStream(System.in);
    String name = "", addr = "", aadhar = "";
    int cno = 0;
    double amount = 0.0;

    public static void main(String arg[]) {
        int no = 0;
      
        DataInputStream in = new DataInputStream(System.in);
        Bank b1 = new Bank();

        while (no <= 5) {
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdrawal");
            System.out.println("4.Display details");
            System.out.println("5.Display balance");

            System.out.println("Please enter your choice");

            try {
                no = Integer.parseInt(in.readLine());

                switch (no) {
                    case 1:
                        b1.create();
                        break;

                    case 2:
                        b1.deposit();
                        break;

                    case 3:
                        b1.withdrawal();
                        break;

                    case 4:
                        b1.display();
                        break;

                    case 5:
                        b1.display_balance();
                        break;

                    default:
                        System.out.println("Please enter valid choice");
                }
            }

            catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }

        System.out.println("Out of Loop");

    }

    void create() {

        try {
            cno = cno + 1;

            System.out.println("Please enter your name: ");
            name = in1.readLine();

            System.out.println("Please enter your Address: ");
            addr = in1.readLine();

            System.out.println("Please enter your Aadhar card: ");
            aadhar = in1.readLine();

        } catch (Exception e) {
            System.out.println("Error Create: " + e);
        }

    }

    void deposit() {
        try {
            System.out.println("Please enter the amount to be deposited: ");
            amount = amount + Double.parseDouble(in1.readLine());

        } catch (Exception e) {
            System.out.println("Error D :" + e);

        }

    }

    void withdrawal() {
        try {
            System.out.println("Please enter the amount to withdraw: ");
            amount = amount - Double.parseDouble(in1.readLine());

        } catch (Exception e) {
            System.out.println("Error W :" + e);

        }
    }

    void display() {
        System.out.println("Customer Id is: " + cno);
        System.out.println("Your name is: " + name);
        System.out.println("Your address is: " + addr);
        System.out.println("Your Aadhar Card number is: " + aadhar);
    }

    void display_balance() {
        System.out.println("The balance amount is " + amount);
    }

}