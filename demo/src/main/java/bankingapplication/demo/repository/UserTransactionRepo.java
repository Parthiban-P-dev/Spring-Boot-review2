package bankingapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bankingapplication.demo.model.UserTransactionModel;

@Repository
public interface UserTransactionRepo extends JpaRepository<UserTransactionModel,Integer>{

    
} 