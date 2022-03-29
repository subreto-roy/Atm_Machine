
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account extends admin {

    //FileReader file;
    int balance, withdraw, deposite, num;

    /*public Account() throws FileNotFoundException {
        this.file = new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\account.txt");
    }*/

    void getLogin() {
        int x = 3;

        while (x > 0) {
            Scanner input = new Scanner(System.in);
            //FileReader file =new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\data.txt");

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
                        {
                            try {
                                WithDraw();
                            } catch (IOException ex) {
                                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                            break;

                        case 2:
                            CheckBalance();
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

   /* void WithDraw() {
        BufferedReader bf = new BufferedReader(file);
        try {

            String st = bf.readLine();
            while ((st = bf.readLine()) != null) {
                StringTokenizer stn = new StringTokenizer(st);
                String rn = stn.nextToken();
                String name = stn.nextToken();
                String password = stn.nextToken();
                //String am=stn.nextToken();
                int balance = Integer.parseInt(stn.nextToken());
                System.out.println("Enter ammount");
                Scanner sc = new Scanner(System.in);
                withdraw = sc.nextInt();
                if (balance >= withdraw) {
                    balance = balance - withdraw;
                    System.out.println("Id " +rn);
                    System.out.println("name " + name);
                    System.out.println("password" + password);
                    System.out.println("Balance Amount is  " + balance);
                    System.out.println("Please collect money");
                    //break;
                } else {
                    System.out.println("You don't have enough money for withdraw");
                }
                System.out.println(" ");
            }
        } catch (IOException ex) {
            //Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
    }*/
    
    
    public void WithDraw() throws IOException{
        
        String ID,Name;
        double salary;
        int withdraw;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter ID");
        String pID=console.nextLine();
        System.out.println("Enter Withdraw amount: ");
        withdraw = console.nextInt();
        
        File originalFile = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\account.txt");
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
          
        
        File tempFile = new File("tempfile.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String line = null;
        while((line = br.readLine()) != null){
            if(line.contains(pID)){
              String strCurrentwithdraw = line.substring(line.lastIndexOf(" "), line.length());
              if(strCurrentwithdraw !=null || !strCurrentwithdraw.trim().isEmpty()){
                  int replwithdraw = Integer.parseInt(strCurrentwithdraw.trim())-withdraw;
                  System.out.println("Withdraw : " + replwithdraw);
                  line = line.substring(0,line.lastIndexOf( " "))+ replwithdraw;
              }
              
            }
            pw.println(line);
            pw.flush();
        }
        pw.close();
        br.close();
        
        if (!originalFile.delete()) {
            System.out.println("Could not delete file");
            return;
        }

        
        if (!tempFile.renameTo(originalFile))
            System.out.println("Could not rename file");
        
        
    }
    public void CheckBalance() {
        System.out.println("Balance of your Account is:    " + balance);
        System.out.println("  ");
    }
}
