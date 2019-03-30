package dgsw.hs.kr.b1ndservice.service;

import dgsw.hs.kr.b1ndservice.interfaces.OnGetClassesListener;
import dgsw.hs.kr.b1ndservice.R;
import dgsw.hs.kr.b1ndservice.Utils;
import dgsw.hs.kr.b1ndservice.retrofit2.interfaces.GetClasses;
import dgsw.hs.kr.b1ndservice.retrofit2.response.ResponseTypeManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class B1ndGetClasses {
    private GetClasses getClassService;

    private OnGetClassesListener getClassesListener;

    public B1ndGetClasses() {
        intiRetrofit();
    }

    private void intiRetrofit(){
        getClassService = Utils.RETROFIT.create(GetClasses.class);
    }

    public void getClasses(String token, OnGetClassesListener onGetClassesListener){
        this.getClassesListener = onGetClassesListener;

        Call<ResponseTypeManager.GetClassesAlias> getClasses = getClassService.getClasses(token);

        getClasses.enqueue(new Callback<ResponseTypeManager.GetClassesAlias>(){
            @Override
            public void onResponse(Call<ResponseTypeManager.GetClassesAlias> call,
                                   Response<ResponseTypeManager.GetClassesAlias> response) {
                if (response.body().getStatus() == 404) {
                    getClassesListener.onGetClassesFailed(response.body().getStatus(),
                            response.body().getMessage());
                } else if (response.body().getStatus() == 200) {
                    getClassesListener.onGetClassesSuccess(response.body().getStatus(),
                            response.body().getData().getClasses());
                }
            }

            @Override
            public void onFailure(Call<ResponseTypeManager.GetClassesAlias> call, Throwable t) {
                getClassesListener.onGetClassesFailed(0,String.valueOf(R.string.error_server));
            }
        });

    }

}
