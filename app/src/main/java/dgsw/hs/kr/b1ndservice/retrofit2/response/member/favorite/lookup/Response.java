package dgsw.hs.kr.b1ndservice.retrofit2.response.member.favorite.lookup;

import android.support.annotation.Nullable;

/**
 * @author dawncrow
 * @date 2018. 1. 11.
 */
public class Response {
    private int status;
    private String message;
    private Data data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int value) {
        this.status = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    @Nullable
    public Data getData() {
        return data;
    }

    public void setData(Data value) {
        this.data = value;
    }
}
