package com.marlabs.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class User implements Serializable {
		private Integer uid;
		private String uname;
		
}
