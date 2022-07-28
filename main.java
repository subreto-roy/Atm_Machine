package newpackage;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        admin ad;
        ad = new Account();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your choose");
        System.out.println("1.Admin");
        System.out.println("2.User");
        int cho = myObj.nextInt();
        if (cho == 1) {

            ad.insert_data();
        } else if (cho == 2) {

            ad.getLogin();

        }

    }
}
