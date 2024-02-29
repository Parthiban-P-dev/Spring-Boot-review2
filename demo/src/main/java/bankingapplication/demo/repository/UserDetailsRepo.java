package bankingapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankingapplication.demo.model.UserDetailsModel;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetailsModel,Integer>{

    
} 