package dgsw.hs.kr.b1ndservice.retrofit2.interfaces;


import android.support.annotation.NonNull;

import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import dgsw.hs.kr.b1ndservice.retrofit2.response.member.login.Request.Request;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Login {
    @NonNull
    @POST("auth/login")
    Call<ResponseTypeManager.LoginAlias> login(@Body Request request);
}
