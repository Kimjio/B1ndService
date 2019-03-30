package dgsw.hs.kr.b1ndservice.retrofit2.response.member.modify.Response;

/**
 * @author dawncrow
 * @date 2018. 2. 6.
 */
public class Response {
    private int status;
    private String message;

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
}
