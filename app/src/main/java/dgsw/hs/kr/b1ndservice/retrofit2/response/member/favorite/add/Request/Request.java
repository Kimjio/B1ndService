package dgsw.hs.kr.b1ndservice.retrofit2.response.member.favorite.add.Request;

import com.google.gson.annotations.SerializedName;

/**
 * @author dawncrow
 */
public class Request {
    @SerializedName("member_id")
    private String memberId;

    public Request(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
