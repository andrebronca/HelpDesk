package com.andrebronca.helpdesk.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.andrebronca.helpdesk.api.entity.User;
import com.andrebronca.helpdesk.api.enums.ProfileEnum;

public class JwtUserFactory {

	
	private JwtUserFactory() {
		
	}
	
	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(),
				mapToGrantedAuthorities(user.getProfile()));
	}
	
	private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profileEnum){
		List<GrantedAuthority> autho = new ArrayList<>();
		autho.add(new SimpleGrantedAuthority(profileEnum.toString()));
		return autho;
	}
}
