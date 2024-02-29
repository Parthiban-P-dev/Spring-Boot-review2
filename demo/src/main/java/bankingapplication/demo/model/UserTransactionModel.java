package bankingapplication.demo.model;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserTransactionModel {
    
    @Id
    private int id;
    private Date date;
    private int transactionid;
    private int transactionamount;
    private String transactiontype;
    private int currentbalance;
    @JsonBackReference
    @ManyToOne()
    public UserModel userModel;
}
