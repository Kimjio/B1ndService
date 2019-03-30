package dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Request;

/**
 * @author dawncrow
 */
public class Request {
    private String id;
    private String pw;
    private String device;

    public Request(String id, String pw) {
        this.id = id;
        this.pw = pw;
        device = "mobile";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }
}
