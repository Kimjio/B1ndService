package dgsw.hs.kr.b1ndservice.retrofit2.interfaces;

import android.support.annotation.NonNull;

import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GetDepartments {

    @NonNull
    @GET("departments")
    Call<ResponseTypeManager.GetDepartmentsAlias> getDepartments(
            @Header("x-access-token") String token);
}
