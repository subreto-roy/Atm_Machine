
import java.util.Scanner;

public class Account extends admin {

    public void getLogin() {
        int x = 3;
        while (x > 0) {
            Scanner input = new Scanner(System.in);
            //FileReader file =new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\data.txt");
            int balance = 20, withdraw, deposite, num;
            String u = "subroto";
            String p = "123";

            Scanner sc = new Scanner(System.in);
             System.out.println("Welcome to Atm machine");
            System.out.println("Enter your UserName and password");
            String user = input.nextLine();
            String pass = input.nextLine();
            if (u.equals(user) && p.equals(pass)) {
                while (true) {
                   
                    System.out.println("1.withdraw");
                    System.out.println("2.Check Balance");
                    System.out.println("3.Exit");
                    num = sc.nextInt();

                    switch (num) {
                        case 1:
                            System.out.println("Enter ammount");
                            withdraw = sc.nextInt();
                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Balance Amount is  " + balance);
                                System.out.println("Please collect money");
                            } else {
                                System.out.println("You don't have enough money for withdraw");
                            }
                            System.out.println(" ");
                            break;
                        case 2:
                            System.out.println("Balance of your Account is:    " + balance);
                            System.out.println("  ");
                            break;

                        case 3:
                            System.exit(0);
                            System.out.println("  ");
                    }
                }
            } else {
                System.out.println("wrong password");
                x--;
            }
        }
    }
}
