package com.mlab.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mlab.entity.BankAccount;
import com.mlab.entity.Person;
import com.mlab.utility.HibernateUtil;

public class BankDaoImpl implements BankDao{

	@Override
	public void saveData() {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getSession()) {
			//prepare object
			Set<BankAccount> accounts=Set.of(new BankAccount("savings","SBI",30000.0),
					new BankAccount("savings","SBH",60000.0));
			
			Person p=new Person("Sachin","Jalna",accounts);
			
			//begin tx
			tx=ses.beginTransaction();
			ses.save(p);
			tx.commit();
			System.out.println("Person Object Saved...");
		} catch (Exception e) {
				e.printStackTrace();
				if(tx!=null)
					tx.rollback();
		}
		// TODO Auto-generated method stub
		
	

	
		
	}

}
