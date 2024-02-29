package bankingapplication.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bankingapplication.demo.model.UserModel;
import bankingapplication.demo.repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    public UserRepo userRepo;

    public UserModel postdeails(UserModel userModel)
    {
        return userRepo.save(userModel);
    }

    public UserModel getbyid(int phonenumber)
    {
        return userRepo.findById(phonenumber).orElse(null);
    }

    public List<UserModel> getallacc()
    {
        return userRepo.findAll();
    }
}
