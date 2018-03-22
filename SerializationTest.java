/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationtest;

import java.io.*;

/**
 *
 * @author zayed news
 */
public class SerializationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Employee e = new Employee();
      e.name = "Zayed News";
      e.address = "Bonasree";
      e.SSN = 181839;
      e.number = 181839;
      
      
      Student s = new Student();
      s.name = "Zayed News";
      s.roll = "181839";
      s.SSN = 181839;
      s.grade = 80;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("C:\\Users\\iit\\Desktop\\SerializationTest\\newfile.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.writeObject(s);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in C:\\Users\\iit\\Desktop\\SerializationTest\\newfile.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }
      
      
      
      //READ
      
      e = null;
      s = null;
      try {
         FileInputStream fileIn = new FileInputStream("C:\\Users\\iit\\Desktop\\SerializationTest\\newfile.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         s = (Student) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
      
      System.out.println("Deserialized Student...");
      System.out.println("Name: " + s.name);
      System.out.println("Address: " + s.roll);
      System.out.println("SSN: " + s.SSN);
      System.out.println("Number: " + s.grade);
    }
    
}
