package dgsw.hs.kr.b1ndservice.service;

import dgsw.hs.kr.b1ndservice.interfaces.OnGetDepartmentsListener;
import dgsw.hs.kr.b1ndservice.R;
import dgsw.hs.kr.b1ndservice.Utils;
import dgsw.hs.kr.b1ndservice.retrofit2.interfaces.GetDepartments;
import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class B1ndGetDepartments {
    private GetDepartments getDepartmentsService;

    OnGetDepartmentsListener getDepartmentsListener;

    public B1ndGetDepartments() {
        intiRetrofit();
    }

    private void intiRetrofit(){
        getDepartmentsService = Utils.RETROFIT.create(GetDepartments.class);
    }

    public void getDepartments(String token, OnGetDepartmentsListener onGetDepartmentsListener){
        this.getDepartmentsListener = onGetDepartmentsListener;
        Call<ResponseTypeManager.GetDepartmentsAlias> getDepartmentsAliasCall =
                getDepartmentsService.getDepartments(token);

        getDepartmentsAliasCall.enqueue(new Callback<ResponseTypeManager.GetDepartmentsAlias>() {
            @Override
            public void onResponse(Call<ResponseTypeManager.GetDepartmentsAlias> call,
                                   Response<ResponseTypeManager.GetDepartmentsAlias> response) {
                if (response.body().getStatus() == 404) {
                    getDepartmentsListener.onGetDepartmentsFailed(response.body().getStatus(),
                            response.body().getMessage());
                } else if (response.body().getStatus() == 200) {
                    getDepartmentsListener.onGetDepartmentsSuccess(response.body().getStatus(),
                            response.body().getData().getDepartments());
                }
            }

            @Override
            public void onFailure(Call<ResponseTypeManager.GetDepartmentsAlias> call, Throwable t) {
                getDepartmentsListener.onGetDepartmentsFailed(0,String.valueOf(R.string.error_server));
            }
        });

    }
}
