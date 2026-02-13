package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Runner {
    static void main(String[] args) {
        Account a = new Account(1, 0, "Dan");
        a.deposit(100);
        a.withdraw(50);
        a.getDetails();
        try {
            a.withdraw(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finally {
            a.close();
        }
        try {
            log("Test");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void log(String msg) throws IOException {
        File file = new File("log.txt");
        if (file.isFile() | file.exists()) {
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(msg + "\r\n");
            br.close();
            fr.close();
        } else {
            throw new IOException("Unable to write to file");
        }
    }
}
