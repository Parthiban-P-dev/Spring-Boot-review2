package bankingapplication.demo.model;

import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserDetailsModel {
 
    @Id
    private int acountnumber;
    private String accountholdername;
    private String iFSCCode;
    private String branch;
    private int phoneNumber;
    private String accountType;
    private Date dateOfIssue;


}
