import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

abstract class admin {

    public void insert_data() throws FileNotFoundException, IOException {
       
        try {
            System.out.println("Enter admin user and password");
            String u1 = "admin";
            String p1 = "1234";
            int n;
            Scanner input = new Scanner(System.in);
            String user = input.nextLine();
            String pass1 = input.nextLine();
            if (u1.equals(user) && p1.equals(pass1)) {
                
               System.out.println("Enter the Account  Name  Password  Amount");
                String text;
                text=input.nextLine();
               
              
                FileWriter file = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\account.txt");
             
               file.write(text);
               file.close();
               
            } else {
                System.out.println("Wrong Information!");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
    
    abstract void getLogin();
    
}
 