package dgsw.hs.kr.b1ndservice.interfaces;

public interface OnLoginSuccessListener {
    void onSuccess(int status, String message, String token, String refreshToken);
    void onFail(String message);
}
