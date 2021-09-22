package com.mlab;

import com.mlab.dao.BankDao;
import com.mlab.dao.BankDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	BankDao bd=new BankDaoImpl();
    	bd.saveData();
    	
    	
    	
    
    }
}
