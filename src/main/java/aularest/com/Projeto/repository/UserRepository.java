package aularest.com.Projeto.repository;

import aularest.com.Projeto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
