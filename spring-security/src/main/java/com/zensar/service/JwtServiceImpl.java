package com.zensar.service;

import java.security.Key;
import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JwtServiceImpl implements JwtService {

	private String generateToken(UserDetails userDetails) {
		return Jwts.builder().setSubject(userDetails.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() * 1000 * 60 * 24))
				.signWith(getSignKey(), SignatureAlgorithm.HS256 )
				.compact();
	}

	private Key getSignKey() {
		return null;
	}
}
