package soccergroup.LoginRegistroMySqlSpringBoot.Service;

import soccergroup.LoginRegistroMySqlSpringBoot.Entity.User;
import soccergroup.LoginRegistroMySqlSpringBoot.Web.DTO.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{

	User save(UserRegistrationDto registrationDto);
	
}
