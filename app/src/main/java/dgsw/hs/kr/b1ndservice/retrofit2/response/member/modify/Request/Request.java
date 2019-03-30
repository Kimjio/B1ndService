package dgsw.hs.kr.b1ndservice.retrofit2.response.member.modify.Request;

import com.google.gson.annotations.SerializedName;

/**
 * @author dawncrow
 */
public class Request {
    private String mobile;
    private String email;

    @SerializedName("profile_image")
    private String profileImage;

    @SerializedName("status_message")
    private String statusMessage;

    public Request(String mobile, String email, String profileImage, String statusMessage) {
        this.mobile = mobile;
        this.email = email;
        this.profileImage = profileImage;
        this.statusMessage = statusMessage;
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

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String value) {
        this.profileImage = value;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }
}
