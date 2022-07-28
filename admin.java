package newpackage;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static newpackage.main.main;
import java.util.regex.*;

abstract class admin {

    public void insert_data() throws FileNotFoundException, IOException {

        try {
            Scanner input = new Scanner(System.in);
            Admin_Data ob = new Admin_Data();
            String u1 = "admin";
            String p1 = "1234";

            int n;
            System.out.println("Enter user name");
            String user = input.nextLine();
            System.out.println("Enter user Password");
            //Console console = System.console();
            //char[] pw = console.readPassword("Password: ");
            //String password = String.valueOf(pw);
            String password = input.nextLine();
            if (u1.equals(user) && p1.equals(password)) {
                System.out.println("Enter Account No");
                String Acc_No = input.nextLine();
                Acc_No = Acc_No.replaceAll("\\s+", " ").trim();
                String regex = "^(?=.*[a-z])(?=."
                        + "*[A-Z])(?=.*\\d)"
                        + "(?=.*[-+_!@#$%^&*., ?]).+$";
                Pattern p = Pattern.compile(regex);
                Matcher m = p.matcher(Acc_No);
                if (m.matches()) {
                    ob.setAccount_id(Acc_No);
                    System.out.println("Enter User Name");
                    String User_name = input.nextLine();
                    User_name = User_name.replaceAll("\\s+", " ").trim();
                    ob.setName(User_name);
                    System.out.println("Enter Password");
                    String pass = input.nextLine();
                    pass = pass.replaceAll("\\s+", " ").trim();
                    ob.setpass(pass);
                    System.out.println("Enter Amount");
                    String Amount = input.nextLine();
                    Amount = Amount.replaceAll("\\s+", " ").trim();
                    ob.setAmount(Amount);
                    FileWriter file = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\newpackage\\account.txt", true);
                    try ( BufferedWriter out = new BufferedWriter(file)) {
                        out.write(ob.getAccount_id() + ' ' + ob.getUser_name() + ' ' + ob.getpass() + ' ' + ob.getamount() + "\n");
                        System.out.println("Insert successful");
                    }

                    System.out.println("Press Enter 1 back to Home");
                    n = input.nextInt();
                    if (n == 1) {
                        main(null);
                    }

                }
                else
                {
                    System.out.println("Account number wrong sequence!");
                }
            } 
            
            else {
                System.out.println("Wrong Information!");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    abstract void getLogin();

}
