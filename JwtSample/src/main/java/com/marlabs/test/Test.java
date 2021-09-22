package com.marlabs.test;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.marlabs.util.JwtUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Test {
	//static String key="Jalna";
	public static void main(String[] args) {
		//Token Generation
		JwtUtil utl=new JwtUtil();
		String token="eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJBMzIzNGYiLCJzdWIiOiJNYXJsYWJzIiwiaXNzIjoiU2FjaGluIiwiaWF0IjoxNjMwMzIwMTk3LCJleHAiOjE2MzAzMjA3OTd9.cuD2xkdPNfwF6xkdXPpBzv3cV3FYPl3hIVTaa4mUpZE";
		//String token=utl.generateToken("A3234f", "Marlabs", "Jalna");
		//System.out.println(token);
		
		//Read Data
		Claims c=utl.getClaims("Jalna",token);
		System.out.println(c.getId());
		System.out.println(c.getSubject());
		System.out.println(c.getExpiration());
		
		
	
		
		/*
		 * String token=Jwts.builder() .setId("A215")//id
		 * .setSubject("Marlabs")//subject .setIssuer("Sachin")//provider
		 * .setIssuedAt(new Date(System.currentTimeMillis()))//token generation date
		 * .setExpiration(new
		 * Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(10)))//valid until
		 * ? .signWith(SignatureAlgorithm.HS256, //signature algorithm
		 * Base64.getEncoder().encode(key.getBytes()))//secrete key
		 * .compact();//converts in to string
		 * 
		 * System.out.println(token);
		 ********************* 
		 * Parsing Of Token *************************** Claims c=Jwts.parser()
		 * .setSigningKey(Base64.getEncoder().encode(key.getBytes()))//secrete key
		 * .parseClaimsJws(token) .getBody();
		 * 
		 * System.out.println(c.getId()); System.out.println(c.getSubject());
		 * System.out.println(c.getIssuer()); System.out.println(c.getExpiration());
		 */
	}

}
