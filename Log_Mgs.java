package newpackage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Log_Mgs extends Log_activity {

    void Log(String mgs1,int mgs2) {
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\newpackage\\data.txt",true);
            BufferedWriter out = new BufferedWriter(myWriter);
            Date current_Date=new Date();
            String date=current_Date.toString();
        
           
            out.write(mgs1 +' '+ "withdraw" +' '+ mgs2 +' '+ "amount" +' '+ date+"\n");
            out.close();
           
        } catch (IOException e) {
            System.out.println("An error occurred.");
          
        }
        
    }
    void Log(String mgs,String mgs3)
    {
         try {
            FileWriter myWriter = new FileWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\newpackage\\data.txt",true);
            BufferedWriter out = new BufferedWriter(myWriter);
            Date current_Date=new Date();
            String date=current_Date.toString();
            out.write(mgs +' '+ "Balance_Check" +' '+ mgs3 +' '+ "amount" +' '+ date+"\n");
            out.close();
           
        } catch (IOException e) {
            System.out.println("An error occurred.");
          
        }
    }

    
    

   
}

