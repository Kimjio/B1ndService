package dgsw.hs.kr.b1ndservice.interfaces;

import okhttp3.ResponseBody;

public interface CallbackResponse<T> {
    void onResponse(T body);

    void onError(ResponseBody errorBody);

    void onFailure(Throwable throwable);
}
