package dgsw.hs.kr.b1ndservice.retrofit2.callback;


import java.net.HttpURLConnection;
import java.util.Objects;


import dgsw.hs.kr.b1ndservice.interfaces.CallbackResponse;
import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginCallback implements Callback<ResponseTypeManager.LoginAlias> {

    private final CallbackResponse <ResponseTypeManager.LoginAlias> mCallbackResponse;

    public LoginCallback(CallbackResponse<ResponseTypeManager.LoginAlias> callbackResponse) {
        mCallbackResponse = callbackResponse;
    }

    @Override
    public void onResponse(
            Call<ResponseTypeManager.LoginAlias> call,
            Response<ResponseTypeManager.LoginAlias> response) {

        if (response.errorBody() != null) {
            mCallbackResponse.onError(response.errorBody());
        } else if (Objects.requireNonNull(response.body()).getStatus()
                == HttpURLConnection.HTTP_OK) {
            mCallbackResponse.onResponse(response.body());
        } else {
            mCallbackResponse.onError(null);
        }
    }

    @Override
    public void onFailure(Call<ResponseTypeManager.LoginAlias> call, Throwable t) {
        mCallbackResponse.onFailure(t);
    }
}

