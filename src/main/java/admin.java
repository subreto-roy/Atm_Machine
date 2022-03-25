
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class admin {

    public void insert_data() throws FileNotFoundException, IOException {
        // System.out.println("cfjk");
        try {
            System.out.println("Enter admin user and password");
            String u1 = "admin";
            String p1 = "1234";
            Scanner input = new Scanner(System.in);
            String user = input.nextLine();
            String pass1 = input.nextLine();
            if (u1.equals(user) && p1.equals(pass1)) {
                //System.out.println("hdfsf");
                System.out.println("Enter User ID");
                String Id = input.nextLine();
                System.out.println("Enter User Name");
                String name = input.nextLine();
                System.out.println("Enter User Password");
                String pass = input.nextLine();
                System.out.println("Enter amount");
                String amount = input.nextLine();

                FileWriter file = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\data.txt");
                file.write(Id);
                file.write(name);
                file.write(pass);
                file.write(amount);
                file.close();
            }
            else
            {
                System.out.println("Wrong Information!");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
