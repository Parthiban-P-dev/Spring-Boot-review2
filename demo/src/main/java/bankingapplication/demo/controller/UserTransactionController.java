package bankingapplication.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import bankingapplication.demo.model.UserTransactionModel;
import bankingapplication.demo.service.UserTransactionService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class UserTransactionController {
    
    @Autowired 
    private UserTransactionService userTransactionService;

    @PostMapping("/posttransaction")
    public UserTransactionModel posttrac(@RequestBody UserTransactionModel userTransactionModel)
    {
        return userTransactionService.postTransactionModel(userTransactionModel);
    }
    
    @GetMapping("/alltransaction")
   public List<UserTransactionModel> get()
   {
    return userTransactionService.getalltransc();
   }

   @GetMapping("/pagemodel/{off}/{size}")
   public Page<UserTransactionModel> sortall(@PathVariable int off,@PathVariable int size)
   {
    return userTransactionService.bypage(off,size);
   }
   

   @GetMapping("/sortpage/{off}/{size}/{transactiontype}")
   public List<UserTransactionModel> pages(@PathVariable int off,@PathVariable int size,@PathVariable String transactiontype)
   {
    return  userTransactionService.getAllPageSort(off, size, transactiontype);
   }
   
   
   
    
}
