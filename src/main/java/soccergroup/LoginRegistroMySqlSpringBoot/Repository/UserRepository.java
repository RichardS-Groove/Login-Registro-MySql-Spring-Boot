package soccergroup.LoginRegistroMySqlSpringBoot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import soccergroup.LoginRegistroMySqlSpringBoot.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	User findByEmail(String email);
	
}
