package newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

class password extends Account {

    void PassWord_Change() throws FileNotFoundException, IOException {
        List<String> lines = new ArrayList<String>();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter ID");
        String pID = console.nextLine();
        System.out.println("Enter Password");
        String pass = console.nextLine();
        System.out.println("Enter New Password");
        String pass1 = console.nextLine();
        File originalFile = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Design_project\\src\\main\\java\\newpackage\\account.txt");
        BufferedReader br = new BufferedReader(new FileReader(originalFile));

        File tempFile = new File("tempfile.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String line = null;
        while ((line = br.readLine()) != null) {

            if (line.contains(pID) && line.contains(pass)) {

                line = line.replace(pass, pass1);

            }

            lines.add(line);
        }

        pw.println(line);
        pw.flush();

        FileWriter fw = new FileWriter(originalFile);
        BufferedWriter out = new BufferedWriter(fw);
        for (String s : lines) {
            out.write(s + "\n");
        }
        out.close();
        out.close();

    }
}
