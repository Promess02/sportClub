package mikolajM.project.sportClub.DTO;

import lombok.Data;
import mikolajM.project.sportClub.model.CreditCard;

@Data
public class CreditCardForm {
    private String email;
    private CreditCard creditCard;
}
