package com.marlabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NamedStoredProcedureQueries
		({@NamedStoredProcedureQuery(name = "firstProcedure",procedureName = "getTickets"),
		@NamedStoredProcedureQuery(name ="secondProcedure",procedureName ="getTicketsByCategory",
		parameters = {@StoredProcedureParameter(mode =ParameterMode.IN,name = "tcategroy",type =String.class)})})
public class Ticket {
	@Id
	private int id;
	private int amount;
	private String category;
}
