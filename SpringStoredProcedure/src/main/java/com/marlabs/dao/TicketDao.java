package com.marlabs.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marlabs.model.Ticket;

@Repository
public class TicketDao {
	@Autowired
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfo(){
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
		
	}
	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfoBycategory(String input){
		return em.createNamedStoredProcedureQuery("secondProcedure")
				 .setParameter("tcategory", input)
				 .getResultList();
		
	}
	
	
}