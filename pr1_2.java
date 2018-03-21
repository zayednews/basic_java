/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1;

/**
 *
 * @author zayed news
 */
//public class Pr1 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        System.out.println("thread is running...");
//    }
    
//}
class Pr1 implements Runnable
{  
        public void run()
        {  
        //Thread currThread = Thread.currentThread();
        
        for(int i=0;i<5;i++)    
        System.out.println("thread is running..."+i);  
        }  
      
    public static void main(String args[])
    {  
        Pr1 m1=new Pr1();  
        Thread t1 =new Thread(m1);  
        // t1.start();
        t1.run();
        
        Pr1 m2=new Pr1();  
        Thread t2 =new Thread(m2);  
        t2.start();
     }  
}  