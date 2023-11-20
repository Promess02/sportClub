package mikolajM.project.sportClub.DTO;

import lombok.Data;

@Data
public class NewsPostForm {
    private String title;
    private String content;
    private Integer locationId;
    private Integer membershipTypeId;
    private Integer activityId;
    private String imageUrl;
}
