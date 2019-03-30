package dgsw.hs.kr.b1ndservice.model;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * @author dawncrow
 * @date 2018. 1. 17.
 */
public final class Favorite {

    @NonNull
    private final Member member = new Member();
    private String idx;

    @SerializedName("member_id")
    private String memberId;

    public String getIdx() {
        return idx;
    }

    public void setIdx(String value) {
        this.idx = value;
    }

    public String getMemberID() {
        return memberId;
    }

    public void setMemberID(String memberId) {
        this.memberId = memberId;
    }

    @NonNull
    public Member getWriterMember() {
        return member;
    }
}
