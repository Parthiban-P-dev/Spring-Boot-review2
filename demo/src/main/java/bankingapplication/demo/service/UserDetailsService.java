package bankingapplication.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bankingapplication.demo.model.UserDetailsModel;
import bankingapplication.demo.repository.UserDetailsRepo;

@Service
public class UserDetailsService {
    
  @Autowired
  private UserDetailsRepo userDetailsRepo;

  public UserDetailsModel postdetails(UserDetailsModel userDetailsModel)
  {
    return userDetailsRepo.save(userDetailsModel);
  }

  public UserDetailsModel getdetails(int phonenumber)
  {
    return userDetailsRepo.findById(phonenumber).orElse(null);
  }
    
  public List<UserDetailsModel> getalldetails()
  {
    return userDetailsRepo.findAll();
  }
}
