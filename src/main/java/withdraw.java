
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class withdraw {

    private static int sum;

    public void WithDraw() throws IOException {

        int x = 0;
        String ID, Name;
        double salary;
        int withdraw;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter ID");
        String pID = console.nextLine();
        System.out.println("Enter Password");
        String pass = console.nextLine();
        System.out.println("Enter Withdraw amount: ");
        withdraw = console.nextInt();

        File originalFile = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\account.txt");
        BufferedReader br = new BufferedReader(new FileReader(originalFile));

        File tempFile = new File("tempfile.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.contains(pID) && line.contains(pass)) {
                //x=x+1;
                String strCurrentMoney = line.substring(line.lastIndexOf(" "), line.length());
                if (strCurrentMoney != null || !strCurrentMoney.trim().isEmpty()) {
                    int RemainMoney = Integer.parseInt(strCurrentMoney.trim()) - withdraw;
                    //System.out.println("Withdraw : " + replenishedSalary);
                    System.out.println("Please collect your money");
                    System.out.println("Cash Out: " + withdraw);
                    sum = RemainMoney;
                    line = line.substring(0, line.lastIndexOf(" ")) + " " + RemainMoney;
                    x++;

                }

            } else {
                if (x == 0) {
                    System.out.println("Wrong Password");
                }
                x++;

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

        if (!tempFile.renameTo(originalFile)) {
            System.out.println("Could not rename file");
        }
        
    }
      public static int val() {
         
        return sum;
    }
     void CheckBalance()
     {
         System.out.println("Reaming Balance :" + sum);
     }
     protected void CheckBalance1(){
       
         System.out.println("Reaming Balance :" + sum);
    }
}
