package dgsw.hs.kr.b1ndservice.retrofit2.response.member.lookup.Response;

/**
 * @author dawncrow
 * @date 2018. 1. 11.
 */
public class Response {
    private String message;
    private Data data;
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data value) {
        this.data = value;
    }
}
