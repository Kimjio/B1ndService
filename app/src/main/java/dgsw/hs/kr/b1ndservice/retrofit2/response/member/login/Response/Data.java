package dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Response;

import com.google.gson.annotations.SerializedName;

/**
 * @author dawncrow
 * @date 2018. 1. 11.
 */
public class Data {
    private String token;
    @SerializedName("refresh_token")
    private String refreshToken;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String value) {
        this.token = value;
    }
}
