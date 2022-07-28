package newpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Statement {

    void Check_statement() throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter ID");
        String ID = console.nextLine();
        System.out.println("Stament Here:\n");
        BufferedReader br = null;
        try {
            String s;

            br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\newpackage\\data.txt"));
            while ((s = br.readLine()) != null) {

                String[] s2 = s.split(" ");

                String key = s2[0];

                if (ID.equalsIgnoreCase(key)) {

                    System.out.println(s2[0] + ' ' + s2[1] + ' ' + s2[2] + ' ' + s2[3] + ' ' + s2[4] + ' ' + s2[5] + ' ' + s2[6] + ' ' + s2[7] + ' ' + s2[8] + ' ' + s2[9]);

                }
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
