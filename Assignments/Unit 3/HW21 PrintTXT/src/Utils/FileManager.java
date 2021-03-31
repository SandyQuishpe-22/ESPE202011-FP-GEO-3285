/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class FileManager {
    
public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;

    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(data + System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;

        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    
    }

 public static String[] read(String filedepartamet) {
        int numberOfLines = 0;
        int counter = 0;
        String[] results = null;
        filedepartamet = null;
        String text = null;
        String document = "C:\\Users\\Usuario\\Desktop\\programacion\\codigos\\ESPE202011-FP-GEO-3285\\Workshops\\Unit 3\\WS27 ADT\\Departament\\departament.txt";
        try ( BufferedReader textBr = new BufferedReader(new FileReader(document))) {
            int numberofLines = 0;
            while ((filedepartamet = textBr.readLine()) != null) {
                numberofLines++;
            }
            
            results = new String[numberOfLines];
             while ((filedepartamet = textBr.readLine()) != null) {
                 results[counter] = textBr.readLine();
             }
            
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return results;
        
  }
}




