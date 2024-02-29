package bankingapplication.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bankingapplication.demo.model.UserDetailsModel;
import bankingapplication.demo.service.UserDetailsService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserDetailsController {
    
    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/postdetails")
    public UserDetailsModel post(@RequestBody UserDetailsModel userDetailsModel)
    {
        return userDetailsService.postdetails(userDetailsModel);
    }

    @GetMapping("/getdetails/{phonenumber}")
    public UserDetailsModel getMethodName(@PathVariable int phonenumber) 
    {
        return userDetailsService.getdetails(phonenumber);
    }

    @GetMapping("/getall")
    public List<UserDetailsModel> getalldel() 
    {
        return userDetailsService.getalldetails();
    }
    
    

    
}
