package mikolajM.project.sportClub.service;

import mikolajM.project.sportClub.DTO.ServiceResponse;
import mikolajM.project.sportClub.model.Activity;
import mikolajM.project.sportClub.model.Membership;
import mikolajM.project.sportClub.model.MembershipType;

public interface MembershipService {
    ServiceResponse<?> getAllMembershipTypes();
    ServiceResponse<?> getMembershipForUser(String userEmail);
    ServiceResponse<?> buyMembership(String userEmail, String membershipDescription, String activityName);
    ServiceResponse<?> getUserMembershipHistory(String userEmail);
}
