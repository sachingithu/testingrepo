package com.singletone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {
	static int count=1;  
    static int  choice;  
    public static void main(String[] args) throws IOException {  
          
        JDBCSingleton jdbc= JDBCSingleton.getInstance();  
          
          
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
   do{   
        System.out.println("DATABASE OPERATIONS");  
        System.out.println(" --------------------- ");  
        System.out.println(" 1. Insertion ");  
        System.out.println(" 2. View      ");  
        
          
        System.out.print("\n");  
        System.out.print("Please enter the choice what you want to perform in the database: ");  
          
        choice=Integer.parseInt(br.readLine());  
        switch(choice) {  
              
           case 1:{  
                    System.out.print("Enter the username you want to insert data into the database: ");  
                    String username=br.readLine();  
                    System.out.print("Enter the password you want to insert data into the database: ");  
                    String password=br.readLine();  
                      
                    try {  
                            int i= jdbc.insert(username, password);  
                            if (i>0) {  
                            System.out.println((count++) + " Data has been inserted successfully");  
                            }else{  
                                System.out.println("Data has not been inserted ");      
                            }  
                          
                        } catch (Exception e) {  
                          System.out.println(e);  
                        }  
                      
                     System.out.println("Press Enter key to continue...");  
                     System.in.read();  
                       
                   }//End of case 1  
                   break;  
            case 2:{  
                    System.out.print("Enter the username : ");  
                    String username=br.readLine();  
               
                    try  {  
                            jdbc.view(username);  
                         } catch (Exception e) {  
                          System.out.println(e);  
                        }  
                     System.out.println("Press Enter key to continue...");  
                     System.in.read();  
                       
                   }//End of case 2  
                  break;  
                               
             default:  
                     return;  
        }  
          
       } while (choice!=2);   
   }  
}
