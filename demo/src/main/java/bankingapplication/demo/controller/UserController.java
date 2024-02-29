package bankingapplication.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bankingapplication.demo.model.UserModel;
import bankingapplication.demo.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/postbynumber")
    public UserModel postall(@RequestBody UserModel userModel)
    {
        return userService.postdeails(userModel);
    }

    @GetMapping("/getalldetails/{phonenumber}")
    public UserModel getallbyno(@PathVariable int phonenumber)
    {
        return userService.getbyid(phonenumber);
    }
    
    @GetMapping("/get")
    public List<UserModel> getall()
    {
        return userService.getallacc();
    }
    
    
    
}
