package newpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/*import withdraw;*/

public class Account extends admin {

    void getLogin() {

        Scanner input = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.println("------Welcome to Atm machine------");

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("1.withdraw");
            System.out.println("2.Check Balance");
            System.out.println("3.Password Change");
            System.out.println("4.Exit");
            System.out.println("5.Statement");
            System.out.println("Choose your option");
            int num;
            num = sc.nextInt();

            switch (num) {
                case 1: {

                    withdraw wit = new withdraw();

                    try {
                        wit.WithDraw();
                    } catch (IOException ex) {
                        Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                break;

                case 2:
                    withdraw ch = new CheckBalance();

                 
                    ch.CheckBalance();

                    break;
                case 3:
                    password pass = new password();
                     {
                        try {
                            pass.PassWord_Change();

                        } catch (IOException ex) {
                            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                case 4:
                    System.exit(0);
                    System.out.println("  ");

                case 5:
                   Statement sm=new Statement();
                {
                    try {
                        sm.Check_statement();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }


            }
        }
    }
}
