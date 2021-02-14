package brankosaponjic.onetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class License {
    @Id
    private int id;
    private String type;
    private Date validFrom;
    private Date validTo;
    
}
