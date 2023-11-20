package mikolajM.project.sportClub.service;

import mikolajM.project.sportClub.DTO.NewsPostForm;
import mikolajM.project.sportClub.DTO.ServiceResponse;

public interface NewsPostService {

    ServiceResponse<?> addNewsPost(NewsPostForm newsPostForm);

    ServiceResponse<?> viewAllNewsPost();

    ServiceResponse<?> viewRecentNewsPosts(int years, int months, int days);

    ServiceResponse<?> viewPostsForActivity(Integer activityId, int years, int months, int days);
    ServiceResponse<?> viewPostsForMembershipType(Integer membershipTypeId, int years, int months, int days);
    ServiceResponse<?> viewPostsForLocation(Integer locationId, int years, int months, int days);
}
