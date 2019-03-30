package dgsw.hs.kr.b1ndservice.model;

import com.google.gson.annotations.SerializedName;

import dgsw.hs.kr.b1ndservice.res.MemberType;

/**
 * @author dawncrow
 */
public class Member {

    private MemberType memberType;

    private String id;
    private String name;
    private String mobile;
    private String email;

    @SerializedName("profile_image")
    private String profileImage;

    @SerializedName("status_message")
    private String statusMessage;

    private int auth;

    @SerializedName("member_id")
    private String memberID;

    @SerializedName("invite_member")
    private String inviteMember;

    public Member(Member member) {
        this.setAuth(member.getAuth());
        this.setEmail(member.getEmail());
        this.setId(member.getId());
        this.setMemberID(member.getMemberID());
        this.setMobile(member.getMobile());
        this.setProfileImage(member.getProfileImage());
        this.setStatusMessage(member.getStatusMessage());
        this.setInviteMember(member.getInviteMember());
        this.setProfileImageWithout(member.getProfileImage());
        this.setName(member.getName());
        this.setMemberType(member.memberType);
    }

    public Member() {
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setProfileImageWithout(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String value) {
        this.mobile = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getInviteMember() {
        return inviteMember;
    }

    public void setInviteMember(String inviteMember) {
        this.inviteMember = inviteMember;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
}
