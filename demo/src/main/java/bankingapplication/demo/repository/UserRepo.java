package bankingapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankingapplication.demo.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer>{

    
}