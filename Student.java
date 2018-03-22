/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Student implements java.io.Serializable {
   public String name;
   public String roll;
   public transient int SSN;
   public double grade;
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + roll);
   }
}