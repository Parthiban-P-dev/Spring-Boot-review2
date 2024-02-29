package bankingapplication.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class UserModel {
    
      @Id
      private int phonenumber;

      @OneToOne
      private UserDetailsModel userDetailsModel;
      @OneToMany(mappedBy = "userModel" ,cascade = CascadeType.ALL)
      private List<UserTransactionModel> userTransactionModel;
      
}
