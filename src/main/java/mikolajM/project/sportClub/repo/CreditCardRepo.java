package mikolajM.project.sportClub.repo;

import mikolajM.project.sportClub.model.CreditCard;

public interface CreditCardRepo extends RepoTemplate<CreditCard>{
    boolean existsCreditCardByNumber(Long number);
}
