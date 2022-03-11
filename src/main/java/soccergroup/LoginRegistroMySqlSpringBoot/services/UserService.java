package soccergroup.LoginRegistroMySqlSpringBoot.services;

import soccergroup.LoginRegistroMySqlSpringBoot.entities.User;
import soccergroup.LoginRegistroMySqlSpringBoot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}
