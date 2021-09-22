package com.marlabs.util;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	//1.generate token
	public String generateToken(String id,String subject,
								String key) {
		return Jwts.builder()
					.setId(id)
					.setSubject(subject)
					.setIssuer("Sachin")
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setExpiration(new Date(System.currentTimeMillis() 
											+ TimeUnit.MINUTES.toMillis(1)))
					.signWith(SignatureAlgorithm.HS256, 
								Base64.getEncoder().encode(key.getBytes()))
					.compact();
	}
	//2.get claims
	public Claims getClaims(String key,String token) {
		return Jwts.parser()
					.setSigningKey(Base64.getEncoder().encode(key.getBytes()))
					.parseClaimsJws(token)
					.getBody();
	}
	
	//instead of reading claims and printing data
	//we can directly write method to read subject
	public String getSubject(String key,String token) {
		return getClaims(key, token).getSubject();
	}
	
	//To Validate Token
	public boolean isValidToken(String key,String token) {
		//expDte > currentDate----then it is valid
		return getClaims(key, token).getExpiration()
						.after(new Date(System.currentTimeMillis()));
	}
	
}
