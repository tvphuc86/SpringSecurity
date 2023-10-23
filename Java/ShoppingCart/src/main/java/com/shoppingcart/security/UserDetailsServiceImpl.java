package com.shoppingcart.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shoppingcart.model.UserEntity;
import com.shoppingcart.repository.UserEntityRepository;

import jakarta.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserEntityRepository userEntityRepository;
	@Override @Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserEntity userEntity = userEntityRepository.findByUserName(username).orElseThrow(()-> new UsernameNotFoundException("Email "+ username + " not found"));
		return new User(userEntity.getUsername(),userEntity.getPassword(), getAuthorities(userEntity));
	}
	private Collection<? extends GrantedAuthority> getAuthorities(UserEntity userEntity) {
		// TODO Auto-generated method stub
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		userEntity.getRoles().forEach(role->{
			authorities.add(new SimpleGrantedAuthority(role.getRole()));
		});
		return authorities;
	}

}
