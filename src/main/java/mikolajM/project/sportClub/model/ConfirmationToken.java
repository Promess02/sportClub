package mikolajM.project.sportClub.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Date;

@Entity
@Table(name = "Confirmation_token")
@Getter
public class ConfirmationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="token_id")
    private Long tokenId;

    @Column(name="confirmation_token")
    private String confirmationToken;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @OneToOne(mappedBy = "userId")
    private User user;

    public ConfirmationToken() {
    }

    public ConfirmationToken(User user) {
        this.user = user;
    }

    public ConfirmationToken(Long tokenId, String confirmationToken, Date createdDate, User user) {
        this.tokenId = tokenId;
        this.confirmationToken = confirmationToken;
        this.createdDate = createdDate;
        this.user = user;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
