package bankingapplication.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import bankingapplication.demo.model.UserTransactionModel;
import bankingapplication.demo.repository.UserTransactionRepo;

@Service
public class UserTransactionService {
    

    @Autowired
    private UserTransactionRepo userTransactionRepo;

    public UserTransactionModel postTransactionModel(UserTransactionModel userTransactionModel)
    {
        return userTransactionRepo.save(userTransactionModel);
    }

    // public UserTransactionModel gUserTransactionModel(int phonenumber)
    // {
    //     return userTransactionRepo.findById(id).orElse(null);
    // }

    public List<UserTransactionModel> getalltransc()
    {
        return userTransactionRepo.findAll();
    }

       public List<UserTransactionModel> sortbytransactiontype(String transactiontype)
    {
        return userTransactionRepo.findAll(Sort.by(Sort.Direction.ASC,transactiontype));
    }



    public Page<UserTransactionModel> bypage(int off,int size)
    {
        return userTransactionRepo.findAll(PageRequest.of(off, size));
    }

    

    public List<UserTransactionModel> getAllPageSort(int offset, int pageSize, String transactiontype)
    {
        PageRequest p = PageRequest.of(offset, pageSize, Sort.Direction.ASC, transactiontype); 
        Page<UserTransactionModel> y =  userTransactionRepo.findAll(p);

        return y.getContent(); 

        
    }
}
