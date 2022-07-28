package newpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class CheckBalance extends withdraw {

    
    @Override
    protected void CheckBalance(){
        Log_activity lg;
        lg = new Log_Mgs();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter ID");
        String pID = console.nextLine();
        System.out.println("Enter Password");
        String pass = console.nextLine();
        int x = 0;
       
        BufferedReader br = null;
        try {
            String s;

            br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\newpackage\\account.txt"));
            while ((s = br.readLine()) != null) {

                String[] s2 = s.split(" ");

                String key = s2[0];
                String key2=s2[2];
                if (pID.equalsIgnoreCase(key) && pass.equalsIgnoreCase(key2)  ) {

                    System.out.println("Remaing Balance :" + s2[3]);
                    String num=s2[3];
                    lg.Log(pID,num);
                }
                else
                 {
                if (x == 0) {
                    if (key.contains(pID)) {
                        System.out.println("Password wrong");
                    } else if(key2.contains(pass)) {
                        System.out.println("User Id wrong");
                    } else if(key.contains(pID) || key2.contains(pass)) {
                        System.out.println("User Id and Password wrong");
                    }

                }
                x++;

            }

            }
            br.close();

        } catch (Exception e) {
            System.out.println("error");
        }

    }

}
